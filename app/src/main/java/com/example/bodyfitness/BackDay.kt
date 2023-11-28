package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityBackDayBinding


class BackDay : AppCompatActivity() {

    private var binding: ActivityBackDayBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBackDayBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.pullUp?.setOnClickListener {
            val intent= Intent(this,PullUp::class.java)
            startActivity(intent)
        }
        binding?.dbRow?.setOnClickListener {
            val intent= Intent(this,DumbbellRow::class.java)
            startActivity(intent)
        }
        binding?.superman?.setOnClickListener {
            val intent= Intent(this,SuperMan::class.java)
            startActivity(intent)
        }

        binding?.dbPullover?.setOnClickListener {
            val intent= Intent(this,PullOver::class.java)
            startActivity(intent)
        }

        binding?.renegadeRows?.setOnClickListener {
            val intent= Intent(this,RenegadeRow::class.java)
            startActivity(intent)
        }

        binding?.reverseFlyes?.setOnClickListener {
            val intent= Intent(this,ReverseFly::class.java)
            startActivity(intent)

        }

    }
}