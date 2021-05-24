package com.pnuema.android.coviSolution.main_stuff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R
import kotlinx.android.synthetic.main.activity_avail_main.*

class AvailActMain: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avail_main)

        bangalore.setOnClickListener() {
            val intent = Intent(this, AvailAct::class.java)
            startActivity(intent)
        }

        others.setOnClickListener() {
            val intent = Intent(this, AvailAct2::class.java)
            startActivity(intent)
        }

        back2.setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }

    }
}

