package com.example.bodyfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.bodyfitness.databinding.ActivityUserDetailBinding


class UserDetail : AppCompatActivity() {



    private  var binding: ActivityUserDetailBinding?= null
    private var userName: String?= null
    private var userAge: String?= null
    private var userWeight: String?= null
    private var selectedGender:String ?= null
    private var userGoal: String?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        //Code for image views for gender
        binding?.maleIv?.setOnClickListener{
            maleSelected()
        }
        binding?.femaleIv?.setOnClickListener{
            femaleSelected()
        }

        //Code for spinner list view for goal
        val goalOption = arrayOf("Weight Gain","Weight Loss","Maintain")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,goalOption)
        binding?.inputGoal?.adapter = adapter
        binding?.inputGoal?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                userGoal= goalOption[p2]
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                userGoal=goalOption[0]
            }
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



        Toast.makeText(this,"$userName,$userAge,$userWeight,$selectedGender,$userGoal",Toast.LENGTH_LONG).show()


    }
}