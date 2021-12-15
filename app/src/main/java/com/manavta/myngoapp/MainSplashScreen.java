package com.manavta.myngoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.manavta.myngoapp.ngo.NGOHomeActivity;

public class MainSplashScreen extends AppCompatActivity {
int time  = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainSplashScreen.this, NGOHomeActivity.class);
                startActivity(i);
                finish();

            }
        },time);
    }
}