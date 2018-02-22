package com.fashantapp.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fashantapp.R;

public class ForgotPassword extends Activity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
back = (Button) findViewById(R.id.back_button);

back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
    }
});



    }
}
