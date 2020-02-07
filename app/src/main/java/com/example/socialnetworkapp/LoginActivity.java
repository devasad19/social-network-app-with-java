package com.example.socialnetworkapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEmail, loginPassword;
    private Button userLogin;
    private ImageView loginWithFacebook, loginWithTwitter, loginWithGoogle;
    private TextView createAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = (EditText) findViewById(R.id.input_login_email);
        loginPassword = (EditText) findViewById(R.id.input_confirm_password);
        userLogin = (Button) findViewById(R.id.user_login_btn);
        loginWithFacebook = (ImageView) findViewById(R.id.login_with_facebook);
        loginWithTwitter = (ImageView) findViewById(R.id.login_with_twitter);
        loginWithGoogle = (ImageView) findViewById(R.id.login_with_google);
        createAccountBtn = (TextView) findViewById(R.id.login_page_account_create_btn);

        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regiIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(regiIntent);
                // finish();
            }
        });


    }
}
