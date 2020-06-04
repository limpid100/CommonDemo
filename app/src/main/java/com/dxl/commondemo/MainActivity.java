package com.dxl.commondemo;

import androidx.viewpager2.widget.ViewPager2;

import com.dxl.commondemo.base.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

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