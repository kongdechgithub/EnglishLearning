package com.example.kongdech.finalend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class page6 extends AppCompatActivity {

    ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_page6);

        songList=(ListView)findViewById(R.id.songList6);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("He is on holiday.","เขาลาพักร้อน",R.raw.he_is_on));
        arrayList.add(new Music("Jane is off sick today.","วันนี้เจนลาป่วย",R.raw.jane_i_off));
        arrayList.add(new Music("Sean isn’t in today.","วันนี้ฌอนไม่มา",R.raw.sean_is));
        arrayList.add(new Music("She’s on maternity leave","เธอลาคลอดอยู่",R.raw.she_on));
        arrayList.add(new Music("Can I help you?","ให้ฉันช่วยไหม",R.raw.can_i));
        arrayList.add(new Music("Do you need any help?","คุณต้องการความช่วยเหลืออะไรไหม",R.raw.do_you_need));
        arrayList.add(new Music("What can I do for you?","ฉันทำอะไรให้คุณได้บ้าง",R.raw.what_can_i));
        arrayList.add(new Music("He is in a meeting.","เขาประชุมอยู่",R.raw.he_is_in));
        arrayList.add(new Music("The reception is on the first floor.","แผนกต้อนรับอยู่ชั้นหนึ่ง",R.raw.the_reception));
        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}

