package com.example.kongdech.finalend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class page2 extends AppCompatActivity {

    ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_page2);

        songList=(ListView)findViewById(R.id.songList2);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("Let me introduce myself. My name is.......","ขอแนะนำตัวเอง ฉันชื่อ",R.raw.let_me));
        arrayList.add(new Music("May i introduce myself. My name is......","ขอแนะนำตัวเอง ฉันชื่อ",R.raw.may_i));
        arrayList.add(new Music("Hello, I'm / Hi,I'm","สวัสดี ฉันชื่อ....",R.raw.hello_iam));
        arrayList.add(new Music("What's your name ?","คุณชื่ออะไร",R.raw.what_name));
        arrayList.add(new Music("I'm from Thailand.","ฉันมาจากประเทศไทย",R.raw.i_thai));
        arrayList.add(new Music("I'm a tourist.","ฉันเป็นนักท่องเที่ยว",R.raw.i_tour));
        arrayList.add(new Music("I live in Phuket.","ฉันอยู่ภูเก็ต",R.raw.i_phuket));
        arrayList.add(new Music("I'm going to Hong Kong.","ผมกำลังจะไปฮ่องกง",R.raw.go_hongkong));
        arrayList.add(new Music("Nice to meet you.","ยินดีที่ได้รู้จักคุณ",R.raw.nice_meet));
        arrayList.add(new Music("I'm happy to see you.","ผมดีใจที่ได้พบคุณ",R.raw.i_happy));
        arrayList.add(new Music("I'm pleased to meet you.","ผมยินดีที่ได้พบคุณ",R.raw.i_please));
        arrayList.add(new Music("Nice talking to you.","ดีใจที่ได้คุยกับคุณ",R.raw.nice_talk));
        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}
