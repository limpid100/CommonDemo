package com.dxl.commondemo.net;

import androidx.annotation.NonNull;

import com.dxl.commondemo.net.base.Callback;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import javax.net.ssl.SSLHandshakeException;

import io.reactivex.observers.DisposableObserver;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/9 9:48 AM
 */
public class ResponseObserver extends DisposableObserver<ResponseBody> {


    private Callback<String, String> mCallback;

    public ResponseObserver(@NonNull Callback<String, String> callback) {
        mCallback = callback;
    }

    @Override
    public void onNext(ResponseBody responseBody) {
        if (responseBody == null) {
            onError(new Throwable("responseBody == null"));
            return;
        }
        String string;
        try {
            string = responseBody.string();
            mCallback.onSuccess(string);
            onComplete();
        } catch (IOException e) {
            e.printStackTrace();
            onError(e);
        }
    }

    @Override
    public void onError(Throwable e) {
        String msg = "";
        if (e instanceof SocketTimeoutException) {
            msg = "请求超时";
        } else if (e instanceof ConnectException) {
            msg = "网络连接超时";
        } else if (e instanceof SSLHandshakeException) {
            msg = "安全证书异常";
        } else if (e instanceof HttpException) {
            int code = ((HttpException) e).code();
            if (code == 504) {
                msg = "网络异常，请检查您的网络状态:错误代码504";
            } else if (code == 404) {
                msg = "请求的地址不存在错误代码404";
            } else {
                msg = "请求失败：" + e.getMessage();
            }
        } else if (e instanceof UnknownHostException) {
            msg = "域名解析失败";
        } else {
            msg = e.getMessage();
        }
        mCallback.onError(msg);
    }

    @Override
    public void onComplete() {
    }



}
