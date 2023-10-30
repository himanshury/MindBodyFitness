package com.example.bodyfitness


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bodyfitness.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private var binding: ActivityLoginBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        firebaseAuth= FirebaseAuth.getInstance()

        binding?.loginButton?.setOnClickListener {
            login()
        }

        //To go to User Signup page

        binding?.signupTV?.setOnClickListener {
            val intent= Intent(this,Signup::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun login()
    {
        val email= binding?.loginEmail?.text.toString().trim()
        val password= binding?.loginPassword?.text.toString().trim()

        //Validation code for correct email, password and confirmPassword.

        if(email.isEmpty() || password.isEmpty() ) {

            Toast.makeText(this,"Please fill all details", Toast.LENGTH_SHORT).show()
            return
        }
        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            Toast.makeText(this,"Enter valid email address", Toast.LENGTH_SHORT).show()
            return
        }


        firebaseAuth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this)
            {
                if(it.isSuccessful)
                {
                    Toast.makeText(this,"User Login successfully!!!",Toast.LENGTH_SHORT).show()
                    val intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                else
                {
                    Toast.makeText(this,"Unable to Login!!!",Toast.LENGTH_SHORT).show()
                }
            }

    }
}