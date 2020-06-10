package com.dxl.commondemo.net.base;

import com.dxl.commondemo.net.ln.URLConstant;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/9 9:37 AM
 */
public final class Config {

    public static final String BASE_URL = URLConstant.BASE_URL;

    /**
     * 网络请求缓存 100M
     */
    public static final long CACHE_SIZE = 1024 * 1024 * 100;

    /**
     * 默认网络请求超时时间 10s
     */
    public static final long DEFAULT_TIMEOUT = 10 * 1000;



}
