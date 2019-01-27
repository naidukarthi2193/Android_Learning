package com.example.timepass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Contacts_Adapter extends ArrayAdapter<Format> {
    public Contacts_Adapter(Context context, List<Format> objects) {
        super(context,0, objects);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView==null){
            listView= LayoutInflater.from(getContext()).inflate
                    (R.layout.each_list,parent,false);
        }

        Format newContact =getItem(position);
        TextView name=(TextView) listView.findViewById(R.id.name);
        TextView number=(TextView)listView.findViewById(R.id.number);
        name.setText(newContact.getName());
        number.setText(newContact.getNumber().toString());



        return  listView;



    }
}
