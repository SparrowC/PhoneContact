package com.jiang.phonecontact.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiang.phonecontact.Data.Contact;
import com.jiang.phonecontact.R;

import java.util.List;

public class DataAdaptor extends BaseAdapter {

    private List<Contact> lists;
    private Context context;
//    View layout;

    public DataAdaptor(Context context, List<Contact> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater=LayoutInflater.from(context);
//        layout=inflater.inflate(R.layout.cell,null);
//        TextView tvNum= (TextView) layout.findViewById(R.id.phoneNum);
//        TextView tvName= (TextView) layout.findViewById(R.id.phoneName);
//        tvName.setText(lists.get(position).getName());
//        tvNum.setText(lists.get(position).getPhoneNum());

        ViewHolder holder=new ViewHolder();
        if(convertView==null){
            convertView=LayoutInflater.from(context).inflate(R.layout.cell, null);
            holder.num= (TextView) convertView.findViewById(R.id.phoneNum);
            holder.name= (TextView) convertView.findViewById(R.id.phoneName);
            holder.num.setText(lists.get(position).getPhoneNum());
            holder.name.setText(lists.get(position).getName());
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
            holder.num.setText(lists.get(position).getPhoneNum());
            holder.name.setText(lists.get(position).getName());
        }
        return convertView;
    }

    private static class ViewHolder{
        TextView name;
        TextView num;
    }
}
