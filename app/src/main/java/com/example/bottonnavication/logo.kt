package com.example.bottonnavication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class logo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        Handler().postDelayed(Runnable {
            val  intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },1000)
    }
}