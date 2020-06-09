package com.dxl.commondemo.net;

import android.app.Activity;

import com.dxl.commondemo.util.DialogUtils;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.android.FragmentEvent;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.trello.rxlifecycle2.components.support.RxFragment;

import java.lang.ref.WeakReference;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/9 9:45 AM
 */
public final class RxUtils {

    /**
     * @param activity    Activity
     * @param showLoading 是否显示Loading
     * @return 转换后的ObservableTransformer
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper(final RxAppCompatActivity activity, final boolean showLoading) {
        if (activity == null) {
            return rxSchedulerHelper();
        }
        return observable -> {
            Observable<T> compose = observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .compose(activity.bindUntilEvent(ActivityEvent.DESTROY));
            if (showLoading) {
                return compose.compose(applyProgressBar(activity, "加载中"));
            } else {
                return compose;
            }
        };
    }


    /**
     * @param fragment    fragment
     * @param showLoading 是否显示Loading
     * @return 转换后的ObservableTransformer
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper(final RxFragment fragment, boolean showLoading) {
        if (fragment == null || fragment.getActivity() == null) {
            return rxSchedulerHelper();
        }
        return observable -> {
            Observable<T> compose = observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .compose(fragment.bindUntilEvent(FragmentEvent.DESTROY));
            if (showLoading) {
                return compose.compose(applyProgressBar(fragment.getActivity(), "加载中"));
            } else {
                return compose;
            }
        };
    }


    /**
     * 统一线程处理
     * @return 转换后的ObservableTransformer
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper() {
        return observable -> observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 显示dialog
     * @param activity
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> applyProgressBar(Activity activity, String message) {
        WeakReference<Activity> activityWeakReference = new WeakReference<>(activity);
        DialogUtils.showDialog(activityWeakReference.get(), message, false);
        return upstream -> upstream.doOnTerminate((Action) DialogUtils::dismissDialog);
    }

}
