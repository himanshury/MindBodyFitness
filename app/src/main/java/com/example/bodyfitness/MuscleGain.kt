package com.example.bodyfitness

import android.content.Intent
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
            val intent= Intent(this,ChestDay::class.java)
            startActivity(intent)
        }

        binding?.backDay?.setOnClickListener{
            val intent= Intent(this,BackDay::class.java)
            startActivity(intent)
        }

        binding?.shoulderDay?.setOnClickListener{
            val intent= Intent(this,ShoulderDay::class.java)
            startActivity(intent)
        }

        binding?.armsDay?.setOnClickListener{
            val intent= Intent(this,ArmsDay::class.java)
            startActivity(intent)
        }

        binding?.legDay?.setOnClickListener{
            val intent= Intent(this,LegDay::class.java)
            startActivity(intent)
        }

        binding?.absDay?.setOnClickListener{
            val intent= Intent(this,AbsDay::class.java)
            startActivity(intent)
        }


    }


}