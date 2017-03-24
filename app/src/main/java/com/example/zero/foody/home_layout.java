package com.example.zero.foody;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Toast;


/**
 * Created by Zero on 3/17/2017.
 */

public class home_layout extends Activity {


    GridView grid;
    String[] web = {
            "Google",
            "Github",
            "Instagram",
            "Facebook",
            "Flickr",
            "Pinterest",
            "Quora",
            "Twitter",
            "Vimeo",
            "WordPress"

    };
    int[] imageId = {
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        CustomGrid adapter = new CustomGrid(home_layout.this, web, imageId);
        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(home_layout.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });


    }
}
