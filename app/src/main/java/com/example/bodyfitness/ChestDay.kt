package com.example.bodyfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityChestDayBinding

class ChestDay : AppCompatActivity() {
    private var binding:ActivityChestDayBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChestDayBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }
}