package com.jerome.widget;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.List;

public class MainAdapter extends BaseQuickAdapter<MainItem,BaseViewHolder> {


    public MainAdapter(int layoutResId, List<MainItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainItem item) {
            helper.setText(R.id.item_main_tv_des,item.mDes);
        helper.setText(R.id.item_main_tv_title,item.mTitle);
        Glide.with(mContext).load(item.mUrl).into((PhotoView) helper.getView(R.id.item_main_iv_icon));
    }
}
