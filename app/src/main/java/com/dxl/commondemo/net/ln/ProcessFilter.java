package com.dxl.commondemo.net.ln;

import android.text.TextUtils;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.dxl.commondemo.util.ProcessUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dujiapin
 * @date 2018/11/5
 */

public class ProcessFilter {
    public static Map<String, String> processParams(String token, Map<String, String> map) {
        Map<String, String> argumentMap = new HashMap<>(map);

        if (!TextUtils.isEmpty(token)) {
            argumentMap.put("token", token);
        }

        argumentMap.put("app_id", URLConstant.APP_ID);

        //获取时间戳
        argumentMap.put("nonce", String.valueOf(System.currentTimeMillis() / 1000));

        //对map进行排序
        Collection<String> keyset = argumentMap.keySet();
        List<String> list = new ArrayList<>(keyset);
        Collections.sort(list);

        //对字符串拼接
        StringBuilder sb = new StringBuilder(URLConstant.SECRET);
        for (String string : list) {
            String s = argumentMap.get(string);
            if (s == null) {
                //防止拼接null导致签名错误
                s = "";
            }
            String tem = String.format("%s%s", string, s);
            sb.append(tem);
        }
        sb.append(URLConstant.SECRET);

        //md5加密
        String sign = ProcessUtils.md5(sb.toString());
        sign = sign.toUpperCase();
        argumentMap.put("sign", sign);

        // aes + base64加密
        Map<String, String> resultMap = new HashMap<>();
        String encrypt = ProcessUtils.encrypt(JSON.toJSONString(argumentMap));
        if (encrypt == null) {
            encrypt = "";
        }
        resultMap.put("code", encrypt);
        Log.i("code", resultMap.toString());
        return resultMap;
    }
}
