package com.fashantapp.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fashantapp.HomePage;
import com.fashantapp.R;
import com.fashantapp.signup.OTPActivity;

public class LoginActivity extends Activity {

    private EditText username,password;
    private CheckBox remember;
    Button login,facebook,google;
    TextView forgot,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.user_name);
        password = (EditText)findViewById(R.id.pass_word);
        remember = (CheckBox)findViewById(R.id.check);
        login = (Button)findViewById(R.id.log_in);
        facebook = (Button)findViewById(R.id.facebook_login);
        google = (Button)findViewById(R.id.google_login);
        forgot = (TextView)findViewById(R.id.for_got);
        signup = (TextView)findViewById(R.id.sign_up);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,OTPActivity.class);
                startActivity(intent);
            }
        });


        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ForgotPassword.class);
                startActivity(intent);
            }
        });




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.length()==0)
                {
                    if(pass.length()==0)
                    {
                        if(remember.isChecked())
                        {
                            remember.setButtonDrawable(R.drawable.check1);
                            username.setText(user);
                            password.setText(pass);
                            Intent intent = new Intent(LoginActivity.this,HomePage.class);
                            startActivity(intent);
                        }
                        else
                        {
                            remember.setButtonDrawable(R.drawable.check);
                            username.setText("");
                            password.setText("");
                            Intent intent = new Intent(LoginActivity.this,HomePage.class);
                            startActivity(intent);
                        }
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this,"Enter Password",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Enter User name",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
