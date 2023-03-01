package com.example.baitapbang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<String> mWordList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.add("Tin 1");
        mWordList.add("Tin 2");
        mWordList.add("Tin 3");
        mWordList.add("Tin 4");
        mWordList.add("Tin 5");
        mWordList.add("Tin 6");
        mWordList.add("Tin 7");
        mWordList.add("Tin 8");
        mWordList.add("Tin 9");
        mWordList.add("Tin 10");
        mWordList.add("Tin 11");
        mWordList.add("Tin 12");
        mWordList.add("Tin 13");
        mWordList.add("Tin 14");
        mWordList.add("Tin 15");
        mWordList.add("Tin 16");
        mWordList.add("Tin 17");



        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}