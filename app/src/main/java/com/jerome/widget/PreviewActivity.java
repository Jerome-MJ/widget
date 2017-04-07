package com.jerome.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.jerome.widget.widget.RadarView;

public class PreviewActivity extends AppCompatActivity {

    private View inflatView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        int layoutId = getIntent().getIntExtra("layoutId", 0);
        String title=getIntent().getStringExtra("title");
        setTitle(title);
        if(layoutId!=0){
            inflatView=LayoutInflater.from(this).inflate(layoutId,null,false);
            View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            if(childAt instanceof RelativeLayout){
                RelativeLayout ll= (RelativeLayout) childAt;
                ll.addView(inflatView,new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            }
        }

    }

    public void btnOpen(View v) {
        //开启雷达扫描
        RadarView radarView = (RadarView) inflatView.findViewById(R.id.radarView);
        radarView.startScan();
    }

    public void btnClose(View v) {
        //停止雷达扫描
        RadarView radarView = (RadarView) inflatView.findViewById(R.id.radarView);
        radarView.stopScan();
    }
}
