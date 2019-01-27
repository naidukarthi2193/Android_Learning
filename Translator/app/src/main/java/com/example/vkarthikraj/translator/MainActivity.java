package com.example.vkarthikraj.translator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     relate=(RelativeLayout)findViewById(R.id.relativeLayout);


     relate.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent oneint = new Intent(MainActivity.this,OneActivity.class);
             startActivity(oneint);


         }
     });


    }

}
