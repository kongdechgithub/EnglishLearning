package com.example.kongdech.finalend;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpashScreen extends AppCompatActivity {
    private Handler objHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        objHandler= new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent objIntent=new Intent(SpashScreen.this,MainActivity.class);
                startActivity(objIntent);
                finish();
            }
        },3000);

    }
    }
