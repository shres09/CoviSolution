package com.pnuema.android.coviSolution.main_stuff



import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class OpenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var handler: Handler
        setContentView(R.layout.activity_open_new)

        handler = Handler()
        handler.postDelayed({

            // Delay and Start Activity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        } , 3000) // here we're delaying to startActivity after 3seconds

    }
    }