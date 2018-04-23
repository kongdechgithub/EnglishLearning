package com.example.kongdech.finalend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class page3 extends AppCompatActivity {

    ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_page3);

        songList=(ListView)findViewById(R.id.songList3);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("Thank you.","ขอบคุณครับ",R.raw.thank_you));
        arrayList.add(new Music("Thank you very much.","ขอบคุณมากครับ",R.raw.thank_you_very_much));
        arrayList.add(new Music("Thanks.","ขอบคุณครับ",R.raw.thanks));
        arrayList.add(new Music("Thanks for your help.","ขอบคุณสำหรับความช่วยเหลือครับ",R.raw.thanks_help));
        arrayList.add(new Music("Thank for everything.","ขอบคุณสำหรับทุกสิ่งครับ",R.raw.thank_for_everything));
        arrayList.add(new Music("Thank you very much for cheering me up.","ขอบคุณมากๆ ครับสำหรับกำลังใจ",R.raw.thank_me_up));
        arrayList.add(new Music("I do appreciate your kindness.","ผมรู้สึกซาบซึ้งในความกรุณาของคุณเหลือเกิน",R.raw.i_kindness));
        arrayList.add(new Music("It was my pleasure.","ผมยินดีครับ",R.raw.it_pleasure));
        arrayList.add(new Music("That’s O.K.","ไม่เป็นไรครับ",R.raw.that_ok));
        arrayList.add(new Music("Not at all.","ไม่เป็นไรครับ",R.raw.not_at_all));
        arrayList.add(new Music("Never mind.","ไม่เป็นไรครับ",R.raw.never_mind));
        arrayList.add(new Music("No problem.","ไม่มีปัญหาครับ",R.raw.no_problem));
        arrayList.add(new Music("I’m sorry. I have kept you waiting.","ผมขอโทษครับที่ปล่อยให้คุณต้องรอ",R.raw.im_sorry_waiting));
        arrayList.add(new Music("I’m sorry to have troubled you.","ผมขอโทษที่รบกวนคุณ",R.raw.im_sorry_troubledyou));
        arrayList.add(new Music("I’m sorry, but I can’t help you.","ผมขอโทษครับ แต่ผมไม่สามารถให้ความช่วยเหลือคุณได้",R.raw.im_sorry_helpyou));
        arrayList.add(new Music("Sorry. I’m late.","ขอโทษที่มาสายครับ",R.raw.sorry_late));
        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);
    }
}
