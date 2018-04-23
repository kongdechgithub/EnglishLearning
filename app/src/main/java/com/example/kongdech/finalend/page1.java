package com.example.kongdech.finalend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Kongdech on 21/8/2560.
 */

public class page1 extends AppCompatActivity {

    ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_page1);

        songList=(ListView)findViewById(R.id.songList);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("Hello","สวัสดี (สำหรับทักทายคนไม่สนิท)",R.raw.hello));
        arrayList.add(new Music("Hi","สวัสดี (สำหรับทักทายคนสนิท)",R.raw.hi));
        arrayList.add(new Music("Good morning","สวัสดีตอนเช้า",R.raw.goodmorning));
        arrayList.add(new Music("Good afternoon","สวัสดีตอนบ่าย",R.raw.goodafternoon));
        arrayList.add(new Music("Good evening","สวัสดีตอนเย็น",R.raw.goodevening));
        arrayList.add(new Music("Long time no see.","ไม่ได้เจอกันตั้งนาน",R.raw.long_time_no_see));
        arrayList.add(new Music("How are things ?","เป็นอย่างไรบ้าง",R.raw.how_are_thing));
        arrayList.add(new Music("How are you keeping ?","สบายดีไหม",R.raw.how_are_you_keeping));
        arrayList.add(new Music("How are you ?","สบายดีไหม",R.raw.how_are_you));
        arrayList.add(new Music("I'm fine thank you.","ฉันสาบยดี ขอบคุณ",R.raw.im_fine));
        arrayList.add(new Music("So-so, Thanks.","เรื่อยๆขอบคุณ",R.raw.soso));
        arrayList.add(new Music("Great, Thanks.","ดีมาก ขอบคุณ",R.raw.great));
        arrayList.add(new Music("Pretty good,thank you.","ค่อนข้างดี ขอบคุณ",R.raw.pretty));
        arrayList.add(new Music("I'm not fine.","ฉันไม่ค่อยสบาย",R.raw.im_not_fine));
        arrayList.add(new Music("I'm not O.K.","ฉันไม่ค่อยสบาย",R.raw.im_not_ok));
        arrayList.add(new Music("Not good.","ไม่ค่อยจะดีนัก",R.raw.not_good));
        arrayList.add(new Music("See you later.","แล้วพบกันใหม่",R.raw.see_you_later));
        arrayList.add(new Music("Good bye.","ลาก่อน",R.raw.goodbye));
        arrayList.add(new Music("See you again.","แล้วพบกันอีก",R.raw.see_you_again));
        arrayList.add(new Music("See you soon.","แล้วพบกันอีกเร็วๆนี้นะ",R.raw.see_you_soon));
        arrayList.add(new Music("So long. Take care.","ลาก่อน ดูแลตัวเองด้วย",R.raw.so_long_take_care));
        arrayList.add(new Music("I must be going.","ฉันต้องไปแล้ว",R.raw.i_must));
        arrayList.add(new Music("Good luck to you.","ขอให้โชคดี",R.raw.good_luck));
        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}