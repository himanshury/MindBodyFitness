package com.example.bodyfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityChestDayBinding
import com.example.bodyfitness.databinding.ActivityFatLossExerciseBinding

class FatLossExercise : AppCompatActivity() {
    private var binding: ActivityFatLossExerciseBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFatLossExerciseBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_fat_loss_exercise)

    }
}