package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityChestDayBinding
import com.example.bodyfitness.databinding.ActivityFatLossExerciseBinding

class FatLossExercise : AppCompatActivity() {
    private var binding: ActivityFatLossExerciseBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFatLossExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.pushUp?.setOnClickListener {
            val intent= Intent(this,PushUp::class.java)
            startActivity(intent)
        }

        binding?.squats?.setOnClickListener {
            val intent= Intent(this,Squats::class.java)
            startActivity(intent)
        }

        binding?.lunges?.setOnClickListener {
            val intent= Intent(this,Lunges::class.java)
            startActivity(intent)
        }

        binding?.dbRow?.setOnClickListener {
            val intent= Intent(this,DbRow::class.java)
            startActivity(intent)
        }

        binding?.mountainClimber?.setOnClickListener {
            val intent= Intent(this,MountainClimber::class.java)
            startActivity(intent)
        }

        binding?.dbDeadlift?.setOnClickListener {
            val intent= Intent(this,DbDeadlift::class.java)
            startActivity(intent)
        }

        binding?.dbShoulderPress2?.setOnClickListener {
            val intent= Intent(this,ShoulderPress::class.java)
            startActivity(intent)
        }


        binding?.plankDB?.setOnClickListener {
            val intent= Intent(this,Plank::class.java)
            startActivity(intent)
        }

        binding?.jumpSquats?.setOnClickListener {
            val intent= Intent(this,JumpSquats::class.java)
            startActivity(intent)
        }

        binding?.russianTwist?.setOnClickListener {
            val intent= Intent(this,RussianTwist::class.java)
            startActivity(intent)
        }

        binding?.squats?.setOnClickListener {
            val intent= Intent(this,Squats::class.java)
            startActivity(intent)
        }

        binding?.thrusters?.setOnClickListener {
            val intent= Intent(this,Thrusters::class.java)
            startActivity(intent)
        }









    }
}