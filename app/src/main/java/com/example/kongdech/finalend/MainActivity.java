package com.example.kongdech.finalend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        ImageButton imageButton1=(ImageButton)findViewById(R.id.imageButton1);
        ImageButton imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        ImageButton imageButton5=(ImageButton)findViewById(R.id.imageButton5);
        ImageButton imageButton6=(ImageButton)findViewById(R.id.imageButton6);
        ImageButton imageButton7=(ImageButton)findViewById(R.id.imageButton7);
        ImageButton imageButton8=(ImageButton)findViewById(R.id.imageButton8);

        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.imageButton1):
                Intent intent=new Intent(getApplicationContext(),page1.class);
                startActivity(intent);
                break;
            case (R.id.imageButton2):
                Intent intent1=new Intent(getApplicationContext(),page2.class);
                startActivity(intent1);
                break;
           case (R.id.imageButton3):
                Intent intent2=new Intent(getApplicationContext(),page3.class);
                startActivity(intent2);
                break;
            case (R.id.imageButton4):
                Intent intent3=new Intent(getApplicationContext(),page4.class);
                startActivity(intent3);
                break;
            case (R.id.imageButton5):
                Intent intent4=new Intent(getApplicationContext(),page5.class);
                startActivity(intent4);
                break;
            case (R.id.imageButton6):
                Intent intent5=new Intent(getApplicationContext(),page6.class);
                startActivity(intent5);
                break;
            case (R.id.imageButton7):
                Intent intent6=new Intent(getApplicationContext(),Test.class);
                startActivity(intent6);
                break;
            case (R.id.imageButton8):
                Intent intent7=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent7);
                break;
        }
        Animation animation=new AlphaAnimation(1.0f,0.0f);
        animation.setDuration(1);
        view.startAnimation(animation);
    }
}
