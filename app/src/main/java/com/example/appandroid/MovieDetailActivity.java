package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailActivity extends AppCompatActivity {

    private ImageView MovieThumbnailImg;
    TextView txttitle,txtmota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        txttitle= (TextView) findViewById(R.id.txttitle);
        txtmota=(TextView) findViewById(R.id.txtmota);
        String mota= getIntent().getStringExtra("mota");
        String imageResourceId = getIntent().getStringExtra("img");
        int resID= getResources().getIdentifier(imageResourceId,"drawable",getPackageName());
        String title=getIntent().getStringExtra("title");
        MovieThumbnailImg= (ImageView) findViewById(R.id.detail_movie_img);
        MovieThumbnailImg.setImageResource(resID);
        //Glide.with(this).load(resID).into(MovieThumbnailImg);
        txttitle.setText(title);
        txtmota.setText(mota);
    }
}