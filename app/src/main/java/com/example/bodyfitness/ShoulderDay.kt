package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityChestDayBinding
import com.example.bodyfitness.databinding.ActivityShoulderDayBinding

class ShoulderDay : AppCompatActivity() {

    private var binding: ActivityShoulderDayBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityShoulderDayBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.pikePushUp?.setOnClickListener {
            val intent= Intent(this,PikePushUp::class.java)
            startActivity(intent)
        }

        binding?.dbShoulderPress?.setOnClickListener {
            val intent= Intent(this,ShoulderPress::class.java)
            startActivity(intent)
        }

        binding?.lateralRaise?.setOnClickListener {
            val intent= Intent(this,LateralRaise::class.java)
            startActivity(intent)
        }
        binding?.frontRaise?.setOnClickListener {
            val intent= Intent(this,FrontRaise::class.java)
            startActivity(intent)
        }
        binding?.reverseFlyes?.setOnClickListener {
            val intent= Intent(this,ReverseFly::class.java)
            startActivity(intent)
        }
        binding?.shoulderTap?.setOnClickListener {
            val intent= Intent(this,ShoulderTap::class.java)
            startActivity(intent)
        }




    }
}