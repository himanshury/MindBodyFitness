package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.muscleGainBtn?.setOnClickListener {
            val intent= Intent(this,MuscleGain::class.java)
            startActivity(intent)
        }

        binding?.fatLossBtn?.setOnClickListener {
            val intent= Intent(this,MuscleGain::class.java)
            startActivity(intent)
        }

        binding?.muscleMaintainBtn?.setOnClickListener {
            val intent= Intent(this,MuscleGain::class.java)
            startActivity(intent)
        }



    }
}