package com.example.vkarthikraj.trials;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private EditText enteredName;
    private SharedPreferences myPrefs;
    private String name;
    private Button but;
    private TextView res;
    private  static final String PREFS="my_Prefs";
    private String mess;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        enteredName=(EditText)findViewById(R.id.editname);
        but=(Button)findViewById(R.id.buttonClick);
        res=(TextView)findViewById(R.id.result);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPrefs=getSharedPreferences(PREFS,0);
                SharedPreferences.Editor editor = myPrefs.edit();
                editor.putString("KEY",enteredName.getText().toString());
                editor.commit();

            }
        });

        SharedPreferences prefs = getSharedPreferences(PREFS,0);

        if(prefs.contains("KEY"))
        {
            mess= prefs.getString("KEY","not found");
            res.setText(mess);


        }








    }
}
