package com.dxl.commondemo.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dxl.commondemo.R;

/**
 * desc   : 加载中。。。
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/8 11:00 AM
 */
public class DialogUtils {

    private static volatile CommonProgressDialog sDialog;

    public static void showDialog(Context context) {
        showDialog(context, "加载中...");
    }

    public static void showDialog(Context context, CharSequence message) {
        showDialog(context, message, false);
    }

    public static void showDialog(Context context, CharSequence message, boolean cancelable) {
        if (sDialog != null && sDialog.isShowing()) {
            sDialog.dismiss();
        }
        if (!(context instanceof Activity)) {
            return;
        }
        sDialog = new CommonProgressDialog(context, message);
        sDialog.setCancelable(cancelable);
        if (((Activity) context).isFinishing()) {
            sDialog = null;
            return;
        }
        sDialog.show();
    }

    public static void dismissDialog() {
        if (sDialog != null && sDialog.isShowing()) {
            sDialog.dismiss();
        }
        sDialog = null;
    }


    public static class CommonProgressDialog extends Dialog {


        CommonProgressDialog(Context context, CharSequence message) {
            super(context, R.style.CustomProgressDialog);
            View view = LayoutInflater.from(context).inflate(R.layout.layout_progress, null);
            TextView tvMessage = (TextView) view.findViewById(R.id.tv_message);
            if (!TextUtils.isEmpty(message)) {
                tvMessage.setText(message);
            }
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            addContentView(view, lp);
        }
    }


}
