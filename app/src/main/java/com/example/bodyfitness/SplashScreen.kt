package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bodyfitness.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private  var binding: ActivitySplashScreenBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.startBtn?.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)

        }

    }


}