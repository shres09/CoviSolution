package com.pnuema.android.coviSolution.main_stuff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R
import kotlinx.android.synthetic.main.activity_avail_others.*

class AvailAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avail_others)

        bangalore.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "bangalore");
            startActivity(intent)
        }

        gurgaon.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "gurgaon");
            startActivity(intent)
        }

        delhi.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "delhi");
            startActivity(intent)
        }
        thane.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "thane");
            startActivity(intent)
        }
        andhra.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "andhrapradesh");
            startActivity(intent)
        }
        telengana.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "telangana");
            startActivity(intent)
        }
        bengal.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "westbengal");
            startActivity(intent)
        }
        pune.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "pune");
            startActivity(intent)
        }
        ahem.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "ahemdabad");
            startActivity(intent)
        }
        vada.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "vadodara");
            startActivity(intent)
        }
        nagpur.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "nagpur");
            startActivity(intent)
        }
        nashik.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "nashik");
            startActivity(intent)
        }
        madhya.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "madhyapradesh");
            startActivity(intent)
        }
        uttar.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "uttarpradesh");
            startActivity(intent)
        }
        rajasthan.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "rajasthan");
            startActivity(intent)
        }
        bhopal.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "bhopal");
            startActivity(intent)
        }
        haryana.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "haryana");
            startActivity(intent)
        }
        tn.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "tamilnadu");
            startActivity(intent)
        }
        gandhi.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "gandhinagar");
            startActivity(intent)
        }
        beed.setOnClickListener() {
            val intent = Intent(this, AvailActView::class.java)
            intent.putExtra("id", "beed");
            startActivity(intent)
        }
        back2.setOnClickListener(){
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

    }
}