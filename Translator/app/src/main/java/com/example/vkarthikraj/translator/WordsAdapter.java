package com.example.vkarthikraj.translator;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Words> {
    public WordsAdapter(Context context, ArrayList<Words> wordsarraylist){

        super(context,0,wordsarraylist);

    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.each_view_layout, parent, false);
        }
            Words currentword =getItem(position);
            TextView name=(TextView) listItemView.findViewById(R.id.headingText);
            TextView number=(TextView) listItemView.findViewById(R.id.descriptionText);
            ImageView img=(ImageView)listItemView.findViewById(R.id.imageView);

            name.setText(currentword.getHeading_Text());
            number.setText(currentword.getDescription_Text());
            img.setImageResource(currentword.getImage_id());

            return listItemView;




    }
}
