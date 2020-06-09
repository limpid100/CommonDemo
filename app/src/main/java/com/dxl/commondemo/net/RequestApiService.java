package com.dxl.commondemo.net;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * desc   : 接口请求
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/8 6:17 PM
 */
public interface RequestApiService {

    /**
     * 通用post请求
     * @param map
     * @return
     */
    @POST(" ")
    Observable<ResponseBody> getData(@QueryMap Map<String, String> map);

    /**
     * post提交的参数如果过长，比如正式考试交卷，用之前的接口调用会抱414异常 HttpException: HTTP 414 Request-URI Too Large
     * * 改用这个接口提交
     *
     * @param map
     * @return
     */
    @FormUrlEncoded
    @POST(" ")
    Observable<ResponseBody> getMainDataLarge(@FieldMap Map<String, String> map);

}
