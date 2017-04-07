package com.jerome.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<MainItem> mData;
    private MainAdapter mAdapter;


    private void initData() {
        mData = new ArrayList<>();
        mData.add(new MainItem("RadarView", "", "雷达图，通过开启与停止扫描雷达"));
        mData.add(new MainItem("BitmapPolygon", "", "未知"));
        mData.add(new MainItem("LinearGradientDemo", "", "未知"));
        mData.add(new MainItem("LinearGradientText", "", "未知"));
        mData.add(new MainItem("LinearGradientPicture", "", "未知"));
        mAdapter = new MainAdapter(R.layout.item_main, mData);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mRecyclerView = (RecyclerView) findViewById(R.id.main_recyclerview);
        initData();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.mRecyclerView.setAdapter(mAdapter);
        this.mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                //单机跳转
            }
        });

        this.mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
            @Override
            public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (view.getId() == R.id.item_main_iv_icon) {
                    //点击查看大图

                }
            }
        });
    }


}
