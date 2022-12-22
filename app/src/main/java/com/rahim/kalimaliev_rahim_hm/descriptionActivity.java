package com.rahim.kalimaliev_rahim_hm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class descriptionActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        imageView = findViewById(R.id.img);
        textView = findViewById(R.id.desc);
        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
        textView.setText(intent.getStringExtra("desc"));

    }


}