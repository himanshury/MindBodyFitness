package com.example.bodyfitness


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.example.bodyfitness.databinding.ActivityUserDetailBinding
import com.google.firebase.auth.FirebaseAuth


import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class UserDetail : AppCompatActivity() {
    private lateinit var databaseReference: DatabaseReference
    private lateinit var firebaseAuth: FirebaseAuth




    private  var binding: ActivityUserDetailBinding?= null
    private var userName: String?= null
    private var userAge: String?= null
    private var userWeight: String?= null
    private var selectedGender:String ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        databaseReference= FirebaseDatabase.getInstance().reference
        firebaseAuth= FirebaseAuth.getInstance()




        //Code for image views for gender
        binding?.maleIv?.setOnClickListener{
            maleSelected()
        }

        binding?.femaleIv?.setOnClickListener{
            femaleSelected()
        }




        binding?.finishBtn?.setOnClickListener{
            userDetail()
        }


    }



    private fun femaleSelected() {
        selectedGender="Female"
        binding?.maleIv?.setImageResource(R.drawable.male)
        binding?.femaleIv?.setImageResource(R.drawable.female_selected)

    }

    private fun maleSelected() {
        selectedGender="Male"
        binding?.maleIv?.setImageResource(R.drawable.male_selected)
        binding?.femaleIv?.setImageResource(R.drawable.female)
    }

    private fun userDetail() {

        userName= binding?.inputName?.text.toString().trim()
        userAge= binding?.inputAge?.text.toString().trim()
        userWeight=binding?.inputWeight?.text.toString().trim()

        if(userName!!.isEmpty() || userAge!!.isEmpty() || userWeight!!.isEmpty())
        {
            Toast.makeText(this,"Please Fill All details!",Toast.LENGTH_SHORT).show()
            return
        }
        else
        {
            val currentUser = firebaseAuth.currentUser
            currentUser?.let { user->
                val noteKey= databaseReference.child("Users").child(user.uid).child("User Detail").push().key

                val userDetail= UserDetails(userName!!,userAge!!,userWeight!!)
                if(noteKey!=null)
                {
                    databaseReference.child("Users").child(user.uid).child("User Detail").child(noteKey).setValue(userDetail)
                        .addOnCompleteListener{ task->

                            if(task.isSuccessful)
                            {
                                Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
                                finish()
                            }
                            else
                            {
                                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
                            }
                        }
                }

            }
        }










        //Toast.makeText(this,"$userName,$userAge,$userWeight,$selectedGender",Toast.LENGTH_LONG).show()










    }
}

