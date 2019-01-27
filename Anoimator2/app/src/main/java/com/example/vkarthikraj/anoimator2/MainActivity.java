package com.example.vkarthikraj.anoimator2;

import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Animation animate;
    private Button but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button) findViewById(R.id.buttonId);
        final ImageView imgView=(ImageView) findViewById(R.id.ImageId);
        imgView.setVisibility(View.INVISIBLE);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anime = AnimationUtils.loadAnimation(getApplicationContext()
                        ,R.anim.fade_anime);
                imgView.startAnimation(anime);
                Handler mhandle = new Handler();
                mhandle.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgView.setVisibility(View.INVISIBLE);

                    }
                },6000);




            }
        });


    }
}
