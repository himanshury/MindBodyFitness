
package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bodyfitness.databinding.ActivityUserProfileBinding
import com.google.firebase.auth.FirebaseAuth

class UserProfile : AppCompatActivity() {
    private var binding:ActivityUserProfileBinding?= null
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        firebaseAuth= FirebaseAuth.getInstance()
        binding?.emailTv?.text=firebaseAuth.currentUser?.email

        binding?.logoutBtn?.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent= Intent(this,SplashScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}