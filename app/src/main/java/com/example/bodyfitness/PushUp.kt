package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityPushUpBinding

class PushUp : AppCompatActivity() {

    private var binding:ActivityPushUpBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPushUpBinding.inflate(layoutInflater)
        setContentView(binding?.root)




    }
}