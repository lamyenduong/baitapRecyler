package com.example.baitapbang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {

    private ArrayList<News> photo_list;
    private Context context;

    public NewsAdapter(ArrayList<News> photo_list, Context context) {
        this.photo_list = photo_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return photo_list.size();
    }

    @Override
    public Object getItem(int position) {
        return photo_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return photo_list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final MyView dataitem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            dataitem = new MyView();
            convertView = inflater.inflate(R.layout.layout, null);
            dataitem.iv_photo = convertView.findViewById(R.id.imageView);
            dataitem.tv_caption = convertView.findViewById(R.id.word);
            dataitem.tv_content = convertView.findViewById(R.id.content);
            convertView.setTag(dataitem);
        }
        else{
            dataitem = (MyView) convertView.getTag();
        }
        Picasso.get().load(photo_list.get(position).getSource_photo()).resize(300,400).centerCrop().into(dataitem.iv_photo);
        dataitem.tv_caption.setText(photo_list.get(position).getTitle_photo());
        dataitem.tv_content.setText(photo_list.get(position).getDescription_photo());
        return convertView;
    }

    private static class MyView {
        ImageView iv_photo;
        TextView tv_caption;
        TextView tv_content;
    }

}
