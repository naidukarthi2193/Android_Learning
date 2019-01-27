package com.example.vkarthikraj.animator;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable animate;
    private ImageView birdImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birdImg = (ImageView) findViewById(R.id.anime);

        birdImg.setBackgroundResource(R.drawable.animate);

        animate = (AnimationDrawable) birdImg.getBackground();
         animate.start();






    }
}
