package com.example.kongdech.finalend;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import at.markushi.ui.CircleButton;

/**
 * Created by Kongdech on 21/8/2560.
 */

public class CustomMusicAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Music>arrayList;
    private MediaPlayer mediaPlayer;



    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class  ViewHolder{
        TextView textView,textView2;
        //ImageView ivPlay,ivStop;
        //-------
        CircleButton btn;
     //   public void startAnimation(Animation animation) {
       // }
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewHolder;

        if(view == null){
            viewHolder=new ViewHolder();
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(layout,null);
            viewHolder.textView=(TextView)view.findViewById(R.id.textView);
            viewHolder.textView2=(TextView)view.findViewById(R.id.textView2);
           // viewHolder.ivPlay= (ImageView) view.findViewById(R.id.ivPlay);
            viewHolder.btn=(CircleButton)view.findViewById(R.id.circleButton);
           // viewHolder.ivStop= (ImageView) view.findViewById(R.id.ivStop);

            view.setTag(viewHolder);
        }else {
            viewHolder=(ViewHolder) view.getTag();
        }

        final Music music=arrayList.get(i);

        viewHolder.textView.setText(music.getName());
        viewHolder.textView2.setText(music.getSinger());

        //play music
       // viewHolder.ivPlay.setOnClickListener(new View.OnClickListener(){
            viewHolder.btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                    try{
                        if(mediaPlayer !=null&&mediaPlayer.isPlaying()) {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                        }
                        }catch (IllegalStateException e){
                        e.printStackTrace();
                    }

                 mediaPlayer=MediaPlayer.create(context,music.getSong());
                 mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });

            }


        });


        return view;

   }


}

