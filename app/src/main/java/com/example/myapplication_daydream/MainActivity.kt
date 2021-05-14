package com.example.myapplication_daydream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.ACTION_DISPLAY_SETTINGS
import android.content.Intent
import android.provider.Settings.ACTION_DREAM_SETTINGS
import android.os.Build.VERSION_CODES
import android.os.Build


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent: Intent
        if (Build.VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN_MR2) {
            intent = Intent(ACTION_DREAM_SETTINGS)
        } else {
            intent = Intent(ACTION_DISPLAY_SETTINGS)
        }
        startActivity(intent)
    }
}
