package com.example.baitapbang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewNewsActivity extends AppCompatActivity {
    TextView tv_detail_title, tv_detail_description;
    ImageView iv_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_news);

        iv_detail = findViewById(R.id.iv_detail);
        tv_detail_title = findViewById(R.id.tv_detail_title);
        tv_detail_description = findViewById(R.id.tv_detail_description);

        News news = (News) getIntent().getSerializableExtra("news");
        int id = (int) getIntent().getLongExtra("id", 0);

        Picasso.get().load(NewsData.getNewsFromId(id).getSource_photo()).resize(400,500).centerCrop().into(iv_detail);
        tv_detail_title.setText((NewsData.getNewsFromId(id).getTitle_photo()));
        tv_detail_description.setText((NewsData.getNewsFromId(id).getDescription_photo()));
    }
}