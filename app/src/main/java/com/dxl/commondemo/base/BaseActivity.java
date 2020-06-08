package com.dxl.commondemo.base;

import androidx.appcompat.app.AppCompatActivity;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/4 9:36 AM
 */
@EActivity
public abstract class BaseActivity extends RxAppCompatActivity {

    @AfterViews
    public void afterViews(){
        initView();
        bindData();
    }

    /**
     * 数据绑定
     */
    protected abstract void bindData();

    /**
     * 初始化view
     */
    protected abstract void initView();
}
