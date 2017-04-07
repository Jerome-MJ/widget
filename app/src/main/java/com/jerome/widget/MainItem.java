package com.jerome.widget;

public class MainItem {
    public String mTitle;
    public String mUrl;
    public String mDes;
    public int mLayoutId;

    public MainItem(int mLayoutId,String title, String url,String des) {
        this.mLayoutId=mLayoutId;
        this.mTitle = title;
        this.mUrl = url;
        this.mDes=des;
    }
}
