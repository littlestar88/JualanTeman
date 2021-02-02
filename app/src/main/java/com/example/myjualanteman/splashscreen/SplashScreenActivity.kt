package com.example.myjualanteman.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myjualanteman.R
import com.example.myjualanteman.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)
    }
}