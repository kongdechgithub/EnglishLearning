package com.example.kongdech.finalend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Test extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_test);

        ImageButton btn1 = (ImageButton) findViewById(R.id.btn1);
        ImageButton btn2 = (ImageButton) findViewById(R.id.btn2);
        ImageButton btn3 = (ImageButton) findViewById(R.id.btn3);
        ImageButton btn4 = (ImageButton) findViewById(R.id.btn4);
        ImageButton btn5 = (ImageButton) findViewById(R.id.btn5);
        ImageButton btn6 = (ImageButton) findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.btn1):
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
                break;
            case (R.id.btn2):
                Intent intent1 = new Intent(getApplicationContext(), QuizActivity1.class);
                startActivity(intent1);
                break;
            case (R.id.btn3):
                Intent intent2 = new Intent(getApplicationContext(), QuizActivity2.class);
                startActivity(intent2);
                break;
            case (R.id.btn4):
                Intent intent3 = new Intent(getApplicationContext(), QuizActivity3.class);
                startActivity(intent3);
                break;
            case (R.id.btn5):
                Intent intent4 = new Intent(getApplicationContext(), QuizActivity4.class);
                startActivity(intent4);
                break;
            case (R.id.btn6):
                Intent intent5 = new Intent(getApplicationContext(), QuizActivity5.class);
                startActivity(intent5);
                break;
        }
    }
}
