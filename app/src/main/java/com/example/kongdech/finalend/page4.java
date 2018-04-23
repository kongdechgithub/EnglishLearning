package com.example.kongdech.finalend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class page4 extends AppCompatActivity {

    ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_page4);

        songList=(ListView)findViewById(R.id.songList4);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("Hello","สวัสดีครับ",R.raw.hello1));
        arrayList.add(new Music("Hello. This is Frank’s house.","สวัสดีครับ นี่บ้านแฟรงค์ครับ",R.raw.hello_house));
        arrayList.add(new Music("Hello. Who do you want to speak to?","สวัสดีครับ คุณต้องการพูดกับใครครับ",R.raw.hello_who_speakto));
        arrayList.add(new Music("Hello, this is Fortune Apartment.","สวัสดีครับ นี่อพาร์ทเมนท์ฟอร์จูนครับ",R.raw.hello_apartment));
        arrayList.add(new Music("Hello,Marriott Hotel.May I help you?","สวัสดีครับโรงแรมมารีออตมีอะไรให้ช่วยครับ",R.raw.hello_help_you));
        arrayList.add(new Music("Who’s calling, please?","นั่นใครพูดสายอยู่ครับ",R.raw.who_calling));
        arrayList.add(new Music("Who is it?","นั่นใครครับ",R.raw.who_is_it));
        arrayList.add(new Music("This is Mac speaking.","นี่แม็คพูดอยู่ครับ",R.raw.this_speaking));
        arrayList.add(new Music("I am john speaking.","ผมจอห์นพูดอยู่ครับ",R.raw.iam_john_speaking));
        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}
