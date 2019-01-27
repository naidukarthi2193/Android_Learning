package com.example.timepass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static EditText text;
    private static ListView listView;
    private static ArrayList<Format> contacts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));
        contacts.add(new Format("karthik",9773092));
        contacts.add(new Format("thiru",9004));

        Contacts_Adapter contacts_adapter =new Contacts_Adapter(this,contacts);
        listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(contacts_adapter);






    }
}
