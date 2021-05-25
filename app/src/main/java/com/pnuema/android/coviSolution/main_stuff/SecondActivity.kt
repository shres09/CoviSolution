package com.pnuema.android.coviSolution.main_stuff


import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.pnuema.android.coviSolution.R
import com.pnuema.android.coviSolution.mainscreen.ui.MainActivity
import kotlinx.android.synthetic.main.activity_two_new.*


class SecondActivity  : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_new)


        val constraintLayout = findViewById<ConstraintLayout>(R.id.layout)
        val animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(1000)
        animationDrawable.setExitFadeDuration(2000)
        animationDrawable.start()

        cvacc.setOnClickListener(){
            Log.i("OpenActivity", "Go to Vaccination Page")

            val intent= Intent(this, VaccinationAct::class.java)
            startActivity(intent)
        }

        nearme.setOnClickListener(){
            Log.i("OpenActivity", "Go to Medical Facilities Page")

            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        availbro.setOnClickListener(){
            Log.i("OpenActivity", "Go to availability Page")

            val intent= Intent(this, AvailActMain::class.java)
            startActivity(intent)
        }

        cmen.setOnClickListener(){
            Log.i("OpenActivity", "Go to Video Page")

            val intent= Intent(this, VideoAct::class.java)
            startActivity(intent)
        }

    }



}