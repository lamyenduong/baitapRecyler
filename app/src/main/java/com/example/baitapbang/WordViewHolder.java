package com.example.baitapbang;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private WordListAdapter mAdapter = null;
    TextView tv_title, tv_content;
    ImageView iv_photo;
    private int id;
    private Context context;

    public TextView getTv_title() {
        return tv_title;
    }

    public void setTv_title(TextView tv_title) {
        this.tv_title = tv_title;
    }

    public TextView getTv_content() {
        return tv_content;
    }

    public void setTv_content(TextView tv_content) {
        this.tv_content = tv_content;
    }

    public ImageView getIv_photo() {
        return iv_photo;
    }

    public void setIv_photo(ImageView iv_photo) {
        this.iv_photo = iv_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }




    public WordViewHolder(View mItemView, WordListAdapter wordListAdapter, Context context) {
        super(mItemView);
        tv_title = mItemView.findViewById(R.id.word);
        tv_content = mItemView.findViewById(R.id.content);
        iv_photo = mItemView.findViewById(R.id.imageView);
        this.mAdapter = wordListAdapter;
        this.context = context;
        mItemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ViewNewsActivity.class);
        News mCurrent = NewsData.getNewsFromId(id);
        intent.putExtra("news", mCurrent);
        context.startActivity(intent);
    }
}
