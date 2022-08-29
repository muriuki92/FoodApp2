package com.example.foodapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.ImageView
import com.google.android.material.animation.AnimationUtils

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val backgrounding: ImageView = findViewById(R.id.slide)
        val animation = AnimationUtils.loadAnimation(this,R.anim.slide)
        backgrounding.startAnimation(animation)
        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }

    }
