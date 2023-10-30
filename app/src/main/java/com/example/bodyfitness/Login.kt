package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private var binding: ActivityLoginBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.loginButton?.setOnClickListener {
            val intent= Intent(this,Signup::class.java)
            startActivity(intent)
        }
    }
}