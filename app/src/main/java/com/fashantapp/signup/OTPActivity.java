package com.fashantapp.signup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fashantapp.R;

public class OTPActivity extends Activity {
private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        next = (Button) findViewById(R.id.continu);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OTPActivity.this,VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}
