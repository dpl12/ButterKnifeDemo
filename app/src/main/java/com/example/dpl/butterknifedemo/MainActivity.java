package com.example.dpl.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.lv)
    ListView lv;
    private MyAdapter adapter;
    private ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        list=new ArrayList<String>();
        list.add("测试1");
        list.add("测试2");
        list.add("测试3");
        list.add("测试4");
        list.add("测试5");
        list.add("测试6");
        list.add("测试7");
        list.add("测试8");
        list.add("测试9");
        list.add("测试10");
        list.add("测试11");
        list.add("测试12");
        list.add("测试13");
        adapter=new MyAdapter(this,list);
        lv.setAdapter(adapter);
    }
    @OnItemClick(R.id.lv)
    public void onMyItemClick(int position){
        Toast.makeText(this,position+"",Toast.LENGTH_SHORT).show();
    }
}
