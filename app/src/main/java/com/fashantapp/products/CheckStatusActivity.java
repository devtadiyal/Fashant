package com.fashantapp.products;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fashantapp.R;

public class CheckStatusActivity extends AppCompatActivity {

    TextView t11,t22,t33,t44,t55,t66;
    ImageView v11;
    Button checkstatus1;
    Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_status);
        t11 = (TextView)findViewById(R.id.t1);
        t22 = (TextView)findViewById(R.id.t2);
        t33 = (TextView)findViewById(R.id.t3);
        t44 = (TextView)findViewById(R.id.t4);
        t55 = (TextView)findViewById(R.id.t5);
        t66 = (TextView)findViewById(R.id.t6);
        v11 = (ImageView)findViewById(R.id.icon);
        checkstatus1= (Button)findViewById(R.id.checkstatus);

        tb = (Toolbar) findViewById(R.id.os_texts);


        tb.setTitle("                "+ReservedItemActivity.company_name);
        tb.setTitleTextColor(Color.parseColor("#696969"));
        setSupportActionBar(tb);
        //  tb.setSubtitle("     Tadiyal");
        getSupportActionBar().setIcon(getDrawable(R.drawable.back));
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDD "+ReservedItemActivity.company_name);

        t11.setText(ReservedItemActivity.company_name);
        t22.setText(ReservedItemActivity.cloth_type);
        t33.setText(ReservedItemActivity.size);
        t44.setText(ReservedItemActivity.color);
        t55.setText(ReservedItemActivity.quantity);
        t66.setText(ReservedItemActivity.tag_line);
        //v11.setImageResource();
    }
}
