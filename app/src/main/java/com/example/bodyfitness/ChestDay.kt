package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityChestDayBinding

class ChestDay : AppCompatActivity() {
    private var binding:ActivityChestDayBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChestDayBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.pushUp?.setOnClickListener {
            val intent= Intent(this,PushUp::class.java)
            startActivity(intent)
        }

        binding?.dbBenchPress?.setOnClickListener {
            val intent= Intent(this,BenchPress::class.java)
            startActivity(intent)
        }

        binding?.dbInclinePress?.setOnClickListener {
            val intent= Intent(this,InclinePress::class.java)
            startActivity(intent)
        }
        binding?.dbDeclinePress?.setOnClickListener {
            val intent= Intent(this,DeclinePress::class.java)
            startActivity(intent)
        }
        binding?.dbFlyes?.setOnClickListener {
            val intent= Intent(this,Flyes::class.java)
            startActivity(intent)
        }
        binding?.dips?.setOnClickListener {
            val intent= Intent(this,Dips::class.java)
            startActivity(intent)
        }


    }
}