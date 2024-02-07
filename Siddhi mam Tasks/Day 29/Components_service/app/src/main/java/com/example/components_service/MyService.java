package com.example.components_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyService extends Service {

    MediaPlayer mp;


    @Override
    public IBinder onBind(Intent intent) {
        return null;


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mp = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
//        this lines means we are setting the alaram tone on song which mobile has set

        mp.setLooping(true);
        mp.start();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }
}