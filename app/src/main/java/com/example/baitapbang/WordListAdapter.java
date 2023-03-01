package com.example.baitapbang;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;


public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>{

    private LinkedList<String> mWordList = new LinkedList<>();

    private final LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> wordlist) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordlist;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.layout, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
