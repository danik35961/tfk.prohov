package com.example.dk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object: CountDownTimer(500, 500) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@MainActivity, StartActivity::class.java)
                startActivity(intent)
                finish()
            }

        }.start()
    }
}