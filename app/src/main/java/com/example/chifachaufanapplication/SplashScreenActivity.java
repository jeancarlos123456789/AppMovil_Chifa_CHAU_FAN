package com.example.chifachaufanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent o = new Intent(this, LoginActivity.class);
        startActivity(o);
        finish();

        //setContentView(R.layout.activity_splash_screen);
    }
}
