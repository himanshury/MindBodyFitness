package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bodyfitness.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {

    //Firebase authentication object is created
    private lateinit var firebaseAuth: FirebaseAuth

    private var binding: ActivitySignupBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Initializing firebaseAuth variable onCreate
        firebaseAuth= FirebaseAuth.getInstance()

        //Connecting button event and user creation function
        binding?.continueButton?.setOnClickListener{
            signupUser()
        }

        //To go to user login page

        binding?.loginTV?.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }



    }
    //Function is created to signup user via email.
    private fun signupUser()
    {
        val userEmail= binding?.signupEmail
        val userPassword = binding?.signupPassword
        val userConfirmPassword = binding?.signupConfirmPassword

        val email=userEmail?.text.toString().trim()
        val password= userPassword?.text.toString().trim()
        val confirmPassword= userConfirmPassword?.text.toString().trim()


        //Validation code for correct email, password and confirmPassword.

        if(email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {

            Toast.makeText(this,"Please fill all details",Toast.LENGTH_SHORT).show()
            return
        }
        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            Toast.makeText(this,"Enter valid email address",Toast.LENGTH_SHORT).show()
            return
        }
         if ( confirmPassword != password) {
             Toast.makeText(this,"Password does not matched",Toast.LENGTH_SHORT).show()
             return
        }



        //Creating user with email and password with firebase
        //This function will create user with email and password
        //We will add an listener to check the call is completed or not.
        firebaseAuth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this)
            {
                if(it.isSuccessful)
                {
                    //User is created.
                    Toast.makeText(this,"Congratulations!!User created successfully.",Toast.LENGTH_SHORT).show()
                    //Code to be further executed.
                    val intent= Intent(this,user_detail::class.java)
                    startActivity(intent)
                    finish()
                }
                else
                {
                    //Account not created.
                    Toast.makeText(this,"Error in creating user",Toast.LENGTH_SHORT).show()
                }
            }

    }
}