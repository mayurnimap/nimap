package com.example.broadcast_receiver_1;
import static android.content.ContentValues.TAG;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.media.AudioManager;
import android.util.Log;
import android.widget.Toast;

public class MuteChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

//        https://chat.openai.com/share/16e48712-e32c-450c-af60-fcc1f9029637
//        refer the chat for better understadning of context
        if (isDeviceMuted(context)) {
            Toast.makeText(context, "Device is Muted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Device is Unmuted", Toast.LENGTH_SHORT).show();
        }
    }

    private static boolean isDeviceMuted(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        if (audioManager != null) {
            int mode = audioManager.getRingerMode();
            return mode == AudioManager.RINGER_MODE_SILENT;
        }
        return false;
    }
}







