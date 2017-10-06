package com.example.dpl.butterknifedemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dpl on 2017/9/26 0026.
 */

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> lists;
    public MyAdapter(Context context, ArrayList<String> list){
        mContext=context;
        lists=list;
    }
    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int i) {
        return lists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null){
          view=View.inflate(mContext,R.layout.item,null);
            holder=new ViewHolder(view);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();

        }
        String s=lists.get(position);
        holder.tv_text.setText(s);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"点击",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
    static class ViewHolder{
        @BindView(R.id.tv_text)TextView tv_text;
        @BindView(R.id.btn)Button btn;
        public ViewHolder(View view){
            ButterKnife.bind(this,view);
        }
    }
}
