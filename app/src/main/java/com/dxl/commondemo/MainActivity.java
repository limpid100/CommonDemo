package com.dxl.commondemo;

import android.util.Log;

import androidx.viewpager2.widget.ViewPager2;

import com.dxl.commondemo.base.BaseActivity;
import com.dxl.commondemo.net.HttpUtils;
import com.dxl.commondemo.net.base.Callback;
import com.dxl.commondemo.net.ln.ProcessFilter;
import com.dxl.commondemo.net.ln.URLConstant;
import com.dxl.commondemo.util.NetworkUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.HashMap;
import java.util.Map;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/3 5:41 PM
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @ViewById
    ViewPager2 viewPager;
    @ViewById
    BottomNavigationView navigationView;


    @Override
    protected void bindData() {
        Map<String, String> map = new HashMap<>(16);
        map.put("method", URLConstant.API_USER_INFO);
        map.put("id", "15310");
        map.put("type", "1");
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.IjE1MzEwIg==.09edea542215df256b93c531756be2ac832f7093cf836c21d1486fac0923cec4";
        HttpUtils.postRequest(ProcessFilter.processParams(token, map), true, this, new Callback<String, String>() {
            @Override
            public void onSuccess(String message) {
                Log.d("dxl", message);
            }

            @Override
            public void onError(String error) {
                Log.e("dxl", error);
            }
        });

    }

    @Override
    protected void initView() {

        //使用自定义的选中和非选中图标
        navigationView.setItemIconTintList(null);

        navigationView.setOnNavigationItemSelectedListener(item -> {
            navigationView.getMenu().getItem(0).setIcon(R.drawable.tab1);
            navigationView.getMenu().getItem(1).setIcon(R.drawable.tab2);
            navigationView.getMenu().getItem(2).setIcon(R.drawable.tab3);
            switch (item.getItemId()) {
                case R.id.navigation_home1:
                    item.setIcon(R.drawable.tab1_s);
                    break;
                case R.id.navigation_home2:
                    item.setIcon(R.drawable.tab2_s);
                    break;
                case R.id.navigation_home3:
                    item.setIcon(R.drawable.tab3_s);
                    break;
                default:
                    break;
            }
            return true;
        });
        //默认选中第0个
        navigationView.setSelectedItemId(navigationView.getMenu().getItem(0).getItemId());
    }
}