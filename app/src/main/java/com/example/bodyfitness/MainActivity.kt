package com.example.bodyfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.bodyfitness.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private var binding: ActivityMainBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        setUpViews()
        binding?.muscleGainBtn?.setOnClickListener {
            val intent= Intent(this,MuscleGain::class.java)
            startActivity(intent)
        }

        binding?.fatLossBtn?.setOnClickListener {
            val intent= Intent(this,FatLossExercise::class.java)
            startActivity(intent)
        }

        binding?.muscleMaintainBtn?.setOnClickListener {
            val intent= Intent(this,MuscleMaintain::class.java)
            startActivity(intent)
        }



    }

    private fun setUpViews() {
            setUpDrawerLayout()
    }

    private fun setUpDrawerLayout() {
        setSupportActionBar(binding?.topAppBar)
        actionBarDrawerToggle= ActionBarDrawerToggle(this,binding?.mainDrawer,R.string.app_name,R.string.app_name)
        actionBarDrawerToggle.syncState()
        binding?.navigationView?.setNavigationItemSelectedListener {
            val intent =Intent(this,UserProfile::class.java)
            startActivity(intent)
            binding?.mainDrawer?.closeDrawers()
            finish()
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}