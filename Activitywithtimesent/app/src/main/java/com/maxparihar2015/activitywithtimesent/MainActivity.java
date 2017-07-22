package com.maxparihar2015.activitywithtimesent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewTreeObserver;

public class MainActivity extends AppCompatActivity {
    private ViewTreeObserver vto;
    private static int TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View myLayout = findViewById(R.id.Strtlaout);


        vto = myLayout.getViewTreeObserver();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, newpass.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

    }}
