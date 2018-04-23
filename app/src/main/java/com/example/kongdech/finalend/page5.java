package com.example.kongdech.finalend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class page5 extends AppCompatActivity {

    ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_page5);

        songList=(ListView)findViewById(R.id.songList5);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("What duty do you have in the company?","คุณมีหน้าที่อะไรในบริษัทครับ",R.raw.what_duty));
        arrayList.add(new Music("My duty is planning marketing plans.","หน้าที่ของผมคือการวางแผนการตลาดครับ",R.raw.my_duty));
        arrayList.add(new Music("What is your responsibility in the company?","คุณรับผิดชอบหน้าที่อะไรในบริษัทครับ",R.raw.what_responsibility));
        arrayList.add(new Music("Hotel reservation is my responsibility.","การจองห้องพักโรงแรมคือหน้าที่ของผมครับ",R.raw.hotel_reservation));
        arrayList.add(new Music("What responsibility do you have in the company?","คุณรับผิดชอบหน้าที่อะไรในบริษัทครับ",R.raw.what_responsibility));
        arrayList.add(new Music("I am responsible for contacting the customers.","ผมรับผิดชอบหน้าที่ติดต่อลูกค้าครับ",R.raw.iam_responsible));
        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}

