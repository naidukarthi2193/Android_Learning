package com.example.vkarthikraj.coffee_shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void customerLogin(View view){
        Toast.makeText(this,"Hey Customer",Toast.LENGTH_LONG).show();


    }

    public void chefLogin(View view){
        Toast.makeText(this,"ja kam pe bsdk",Toast.LENGTH_LONG).show();
    }
}
