package com.example.baitapbang;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final WordListAdapter mAdapter;
    TextView wordItemView;
    public WordViewHolder(View mItemView, WordListAdapter wordListAdapter) {
        super(mItemView);
        wordItemView = mItemView.findViewById(R.id.word);
        this.mAdapter = wordListAdapter;
        mItemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
