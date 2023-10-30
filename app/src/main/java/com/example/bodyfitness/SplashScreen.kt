package com.example.bodyfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bodyfitness.databinding.ActivitySplashScreenBinding
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent

class SplashScreen : AppCompatActivity() {
    private  var binding: ActivitySplashScreenBinding?= null
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        firebaseAuth= FirebaseAuth.getInstance()
        //When user has logged in firebase store that user into current user.

        if(firebaseAuth.currentUser !=null)
        {
            Toast.makeText(this,"User already Logged in.",Toast.LENGTH_SHORT).show()
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


        //If user is already logged in then show home page
        // If not then show the login page

        binding?.startBtn?.setOnClickListener {
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
            finish()


        }

    }


}