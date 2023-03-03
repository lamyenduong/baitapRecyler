package com.example.baitapbang;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;


public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {

    private ArrayList<News> mNews;
    Context context;
    private final LayoutInflater mInflater;

    public WordListAdapter(Context context, ArrayList<News> news) {
        mInflater = LayoutInflater.from(context);
        this.mNews = news;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.layout, parent, false);
        return new WordViewHolder(mItemView, this, context);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        News mCurrent = mNews.get(position);

        holder.setId(mCurrent.getId());
        holder.getTv_title().setText(mCurrent.getTitle_photo());
        Picasso.get().load(mCurrent.getSource_photo()).resize(300, 400).centerCrop().into(holder.getIv_photo());

        ArrayList<String> strDiv = new ArrayList<>();
        strDiv.addAll(Arrays.asList(mCurrent.getDescription_photo().split(" ")));
        if (strDiv.size() <= 10) {
            holder.getTv_content().setText(mCurrent.getDescription_photo());
        } else {
            strDiv.subList(10, strDiv.size()).clear();
            String strJoin = String.join(" ", strDiv);
            holder.getTv_content().setText(strJoin + "...");
        }
    }

    @Override
    public int getItemCount() {
        return mNews.size();
    }
}
