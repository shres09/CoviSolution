package com.pnuema.android.coviSolution.main_stuff

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.pnuema.android.coviSolution.R
import kotlinx.android.synthetic.main.activity_vaccine.*

class VaccinationAct: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.layout1)
        val animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(1000)
        animationDrawable.setExitFadeDuration(2000)
        animationDrawable.start()

        back1.setOnClickListener() {
            Log.i("SecondActivity", "Go to previous page", )

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        c4.setOnClickListener() {
            val intent = packageManager.getLaunchIntentForPackage("nic.goi.aarogyasetu")
            startActivity(intent)
        }

            c5.setOnClickListener() {
                val intent = packageManager.getLaunchIntentForPackage("com.cowinapp.app")
                startActivity(intent)

            }

        cowinurl.setOnClickListener() {
            val url = "https://www.cowin.gov.in/home"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }



    }
    }
