package com.example.vkarthikraj.translator;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Words {

    public String getHeading_Text() {
        return heading_Text;
    }

    public String getDescription_Text() {
        return description_Text;
    }

    public int getImage_id() {
        return image_id;
    }

    private String heading_Text,description_Text;
    private int image_id;


    public Words(String heading_Text, String description_Text, int image_id) {
        this.heading_Text = heading_Text;
        this.description_Text = description_Text;
        this.image_id = image_id;
    }


}
