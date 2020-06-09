package com.dxl.commondemo.net;

import android.app.Activity;

import com.dxl.commondemo.app.CommonApp;
import com.dxl.commondemo.net.base.Callback;
import com.dxl.commondemo.net.base.Config;
import com.dxl.commondemo.net.interceptor.HttpCacheInterceptor;
import com.dxl.commondemo.net.interceptor.HttpHeaderInterceptor;
import com.dxl.commondemo.net.interceptor.LoggingInterceptor;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.dxl.commondemo.net.base.Config.DEFAULT_TIMEOUT;

/**
 * desc   : 网络请求
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/8 5:48 PM
 */
public class HttpUtils {

    private static RequestApiService sApiService;

    /**
     * 设置OkHttp client
     * 可以配置一些网络请求配置（请求头，拦截器，缓存等）
     *
     * @return
     */
    public static OkHttpClient.Builder getOkHttpClientBuilder() {
        File cacheFile = new File(CommonApp.getAppContext().getCacheDir(), "cache");
        //100Mb
        Cache cache = new Cache(cacheFile, Config.CACHE_SIZE);

        return new OkHttpClient.Builder()
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .addInterceptor(new LoggingInterceptor())
                .addInterceptor(new HttpHeaderInterceptor())
                .addNetworkInterceptor(new HttpCacheInterceptor())
                // .sslSocketFactory(SslContextFactory.getSSLSocketFactoryForTwoWay())  // https认证 如果要使用https且为自定义证书 可以去掉这两行注释，并自行配制证书。
                // .hostnameVerifier(new SafeHostnameVerifier())
                .cache(cache);
    }

    /**
     * 获取Retrofit构造器
     *
     * @param baseUrl
     * @return
     */
    public static Retrofit.Builder getRetrofitBuilder(String baseUrl) {
        OkHttpClient okHttpClient = getOkHttpClientBuilder().build();
        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseUrl);
    }

    private static <T> T getApiService(Class<T> cls, String baseUrl) {
        Retrofit retrofit = getRetrofitBuilder(baseUrl).build();
        return retrofit.create(cls);
    }


    public static RequestApiService getRequestApiService() {
        if (sApiService == null) {
            sApiService = getApiService(RequestApiService.class, Config.BASE_URL);
        }
        return sApiService;
    }


    /**
     * 通用post请求
     *
     * @param params
     * @param showProgress
     * @param activity
     * @param callback
     */
    public static void postRequest(Map<String, String> params,
                                   boolean showProgress,
                                   Activity activity,
                                   Callback<String, String> callback) {
        request(getRequestApiService().getData(params), activity, showProgress, callback);
    }

    /**
     * 通用请求
     * @param observable
     * @param activity
     * @param showProgress
     * @param callback
     */
    public static void request(Observable<ResponseBody> observable,
                               Activity activity,
                               boolean showProgress,
                               Callback<String, String> callback) {

        observable.compose(RxUtils.rxSchedulerHelper((RxAppCompatActivity) activity, showProgress))
                .subscribe(new ResponseObserver(callback));
    }

}
