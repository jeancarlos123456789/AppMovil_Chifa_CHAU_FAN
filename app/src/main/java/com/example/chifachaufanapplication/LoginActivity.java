package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.chifachaufanapplication.Models.user;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtUser;
    EditText txtPassword;

    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);

        btnRegistrar = findViewById(R.id.btnregistrar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.passwordIsValid(txtUser.getText().toString(),
                        txtPassword.getText().toString())){
                    Intent o = new Intent(LoginActivity.this,
                            MainActivity.class);
                    startActivity(o);
                }else{

                }


            }
        });
         btnRegistrar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent o = new Intent(LoginActivity.this,
                         MainActivity.class);
                 startActivity(o);
             }
         });


    }
}
