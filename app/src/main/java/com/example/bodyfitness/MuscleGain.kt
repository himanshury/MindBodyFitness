package com.example.bodyfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityMuscleGainBinding


class MuscleGain : AppCompatActivity() {

    private var binding:ActivityMuscleGainBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMuscleGainBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.chestDay?.setOnClickListener{

        }
    }


}