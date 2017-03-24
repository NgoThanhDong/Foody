package com.example.zero.foody;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.view.Menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends TabActivity {
   TabHost tabhost;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabhost = (TabHost)findViewById(android.R.id.tabhost);
        tabhost.setup();
        Intent intent;
        //Creating tab menu.
        TabHost.TabSpec TabMenu1 = tabhost.newTabSpec("First tab");
        TabHost.TabSpec TabMenu2 = tabhost.newTabSpec("Second Tab");
        TabHost.TabSpec TabMenu3 = tabhost.newTabSpec("Third Tab");
        TabHost.TabSpec TabMenu4 = tabhost.newTabSpec("Fourth Tab");
        TabHost.TabSpec TabMenu5 = tabhost.newTabSpec("Fifth Tab");


        //Set tab 1 activity to tab 1 menu.
        TabMenu1.setContent(new Intent(this,home_layout.class));
        //Setting up tab 1 name.x`
        TabMenu1.setIndicator("",getResources().getDrawable(R.drawable.icon_home_layout));

        //Setting up tab 2 name.
        TabMenu2.setIndicator("Tab2");
        //Set tab 2 activity to tab 2 menu.
        TabMenu2.setContent(new Intent(this,tab2_Activyti.class));

        //Setting up tab 3 name.
        TabMenu3.setIndicator("Tab3");
        //Set tab 3 activity to tab 3 menu.
        TabMenu3.setContent(new Intent(this,tab3_Activyti.class));

        //Setting up tab 4 name.
        TabMenu4.setIndicator("Tab4");
        //Set tab 4 activity to tab 4 menu.
        TabMenu4.setContent(new Intent(this,tab4_Activyti.class));

        //Setting up tab 5 name.
        TabMenu5.setIndicator("Tab5");
        //Set tab 5 activity to tab 5 menu.
        TabMenu5.setContent(new Intent(this,tab5_Activyti.class));

        //Adding tab1, tab2, tab3 to tabhost view.

        tabhost.addTab(TabMenu1);
        tabhost.addTab(TabMenu2);
        tabhost.addTab(TabMenu3);
        tabhost.addTab(TabMenu4);
        tabhost.addTab(TabMenu5);



    }


}


