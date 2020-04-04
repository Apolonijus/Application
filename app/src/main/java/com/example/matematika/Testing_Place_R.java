package com.example.matematika;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Testing_Place_R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing__place__r);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.nuke);
        mp3.start();
    }
}
