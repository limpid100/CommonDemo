package com.dxl.commondemo.ui.news.adapter;

import com.chad.library.adapter.base.BaseDelegateMultiAdapter;
import com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dxl.commondemo.bean.News;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/10 8:47 AM
 */
public class NewsListAdapter extends BaseDelegateMultiAdapter<News, BaseViewHolder> {

    public NewsListAdapter() {
        super();
        setMultiTypeDelegate(new BaseMultiTypeDelegate<News>() {
            @Override
            public int getItemType(@NotNull List<? extends News> list, int position) {
                News news = list.get(position);
                return 0;
            }
        });
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, News news) {

    }
}
