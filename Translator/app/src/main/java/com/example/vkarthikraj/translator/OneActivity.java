package com.example.vkarthikraj.translator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("Name_1","Phonenumber_1", R.drawable.sample_0));
        words.add(new Words("Name_2","Phonenumber_2", R.drawable.sample_1));
        words.add(new Words("Name_3","Phonenumber_3", R.drawable.sample_2));
        words.add(new Words("Name_4","Phonenumber_4", R.drawable.sample_3));
        words.add(new Words("Name_5","Phonenumber_5", R.drawable.sample_4));
        words.add(new Words("Name_6","Phonenumber_6", R.drawable.sample_5));
        words.add(new Words("Name_7","Phonenumber_7", R.drawable.sample_6));
        words.add(new Words("Name_8","Phonenumber_8", R.drawable.sample_7));

        words.add(new Words("Name_1","Phonenumber_1", R.drawable.sample_0));
        words.add(new Words("Name_2","Phonenumber_2", R.drawable.sample_1));
        words.add(new Words("Name_3","Phonenumber_3", R.drawable.sample_2));
        words.add(new Words("Name_4","Phonenumber_4", R.drawable.sample_3));
        words.add(new Words("Name_5","Phonenumber_5", R.drawable.sample_4));
        words.add(new Words("Name_6","Phonenumber_6", R.drawable.sample_5));
        words.add(new Words("Name_7","Phonenumber_7", R.drawable.sample_6));
        words.add(new Words("Name_8","Phonenumber_8", R.drawable.sample_7));

        words.add(new Words("Name_1","Phonenumber_1", R.drawable.sample_0));
        words.add(new Words("Name_2","Phonenumber_2", R.drawable.sample_1));
        words.add(new Words("Name_3","Phonenumber_3", R.drawable.sample_2));
        words.add(new Words("Name_4","Phonenumber_4", R.drawable.sample_3));
        words.add(new Words("Name_5","Phonenumber_5", R.drawable.sample_4));
        words.add(new Words("Name_6","Phonenumber_6", R.drawable.sample_5));
        words.add(new Words("Name_7","Phonenumber_7", R.drawable.sample_6));
        words.add(new Words("Name_8","Phonenumber_8", R.drawable.sample_7));

        words.add(new Words("Name_1","Phonenumber_1", R.drawable.sample_0));
        words.add(new Words("Name_2","Phonenumber_2", R.drawable.sample_1));
        words.add(new Words("Name_3","Phonenumber_3", R.drawable.sample_2));
        words.add(new Words("Name_4","Phonenumber_4", R.drawable.sample_3));
        words.add(new Words("Name_5","Phonenumber_5", R.drawable.sample_4));
        words.add(new Words("Name_6","Phonenumber_6", R.drawable.sample_5));
        words.add(new Words("Name_7","Phonenumber_7", R.drawable.sample_6));
        words.add(new Words("Name_8","Phonenumber_8", R.drawable.sample_7));

        words.add(new Words("Name_1","Phonenumber_1", R.drawable.sample_0));
        words.add(new Words("Name_2","Phonenumber_2", R.drawable.sample_1));
        words.add(new Words("Name_3","Phonenumber_3", R.drawable.sample_2));
        words.add(new Words("Name_4","Phonenumber_4", R.drawable.sample_3));
        words.add(new Words("Name_5","Phonenumber_5", R.drawable.sample_4));
        words.add(new Words("Name_6","Phonenumber_6", R.drawable.sample_5));
        words.add(new Words("Name_7","Phonenumber_7", R.drawable.sample_6));
        words.add(new Words("Name_8","Phonenumber_8", R.drawable.sample_7));

        words.add(new Words("Name_1","Phonenumber_1", R.drawable.sample_0));
        words.add(new Words("Name_2","Phonenumber_2", R.drawable.sample_1));
        words.add(new Words("Name_3","Phonenumber_3", R.drawable.sample_2));
        words.add(new Words("Name_4","Phonenumber_4", R.drawable.sample_3));
        words.add(new Words("Name_5","Phonenumber_5", R.drawable.sample_4));
        words.add(new Words("Name_6","Phonenumber_6", R.drawable.sample_5));
        words.add(new Words("Name_7","Phonenumber_7", R.drawable.sample_6));
        words.add(new Words("Name_8","Phonenumber_8", R.drawable.sample_7));

        WordsAdapter wordAdapter = new WordsAdapter(this,words);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(wordAdapter);
        GridView grid =(GridView)findViewById(R.id.gridview);
        grid.setAdapter(wordAdapter);













    }
}
