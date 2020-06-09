package com.dxl.commondemo.net.base;

/**
 * desc   :通用回调
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/9 8:42 AM
 */
public interface Callback<K, V> {
    /**
     * 成功回调
     * @param message
     */
    void onSuccess(K message);

    /**
     * 失败回调
     * @param error
     */
    void onError(V error);
}
