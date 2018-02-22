package com.fashantapp.signup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fashantapp.HomePage;
import com.fashantapp.R;

public class VerifyActivity extends Activity {
Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup2_layout);

        next = (Button) findViewById(R.id.continu);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VerifyActivity.this, HomePage.class));
            }
        });
    }
}
