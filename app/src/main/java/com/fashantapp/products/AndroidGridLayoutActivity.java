package com.fashantapp.products;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.fashantapp.R;


public class AndroidGridLayoutActivity extends AppCompatActivity {

    GridView gridview;
    Toolbar tb;
    Button men_button,women_button;

    public static String[] osNameList = {
            "SHIRT",
            "T-SHIRT",
            "JACKET",
            "SHOES",
            "DENIM",
            "PANTS",
            "SPORTS",
            "FORMAL",
            "ACCESSORIES",
    };
    public static int[] osImages = {
            R.drawable.shirt,
            R.drawable.tshirt,
            R.drawable.jacket,
            R.drawable.shoes,
            R.drawable.denim,
            R.drawable.pants,
            R.drawable.sports,
            R.drawable.formal,
            R.drawable.accessories,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);

        men_button = (Button) findViewById(R.id.men);
        women_button = (Button) findViewById(R.id.women);

         gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new ImageAdapter(this, osNameList, osImages));

        tb = (Toolbar) findViewById(R.id.os_texts);


        tb.setTitle("            PRODUCTS");
        tb.setTitleTextColor(Color.parseColor("#696969"));
        setSupportActionBar(tb);
        //  tb.setSubtitle("     Tadiyal");
        getSupportActionBar().setIcon(getDrawable(R.drawable.bell));

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AndroidGridLayoutActivity.this,NotificationActivity.class));
            }
        });



        men_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                men_button.setBackgroundColor(Color.BLACK);
                men_button.setTextColor(Color.WHITE);

                women_button.setBackgroundColor(Color.WHITE);
                women_button.setTextColor(Color.BLACK);
            }
        });

        women_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                women_button.setBackgroundColor(Color.BLACK);
                women_button.setTextColor(Color.WHITE);

                men_button.setBackgroundColor(Color.WHITE);
                men_button.setTextColor(Color.BLACK);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mii = getMenuInflater();
        mii.inflate(R.menu.settings,menu);

        MenuItem mi = menu.findItem(R.id.menu_email);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_email:
                startActivity(new Intent(AndroidGridLayoutActivity.this,ReservedItemActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}