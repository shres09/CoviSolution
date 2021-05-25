package com.pnuema.android.coviSolution.main_stuff

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R

class AvailActView: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_avail_others)
        val b = intent.extras
        val id = b!!.getString("id")

        val webView = findViewById<View>(R.id.webview) as WebView
        webView.settings.javaScriptEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true

        when(id){
            "bangalore" -> webView.loadUrl("https://covidbengaluru.com/")
            "gurgaon" -> webView.loadUrl("https://covidggn.com/")
            "delhi" -> webView.loadUrl("https://coviddelhi.com/")
            "thane" -> webView.loadUrl("https://covidthane.org/availabiltyOfHospitalBeds.html")
            "andhrapradesh" -> webView.loadUrl("https://covidaps.com/")
            "telangana" -> webView.loadUrl("https://covidtelangana.com/")
            "westbengal" -> webView.loadUrl("https://covidwb.com/")
            "pune" -> webView.loadUrl("https://covidpune.com/")
            "ahemdabad" -> webView.loadUrl("https://covidamd.com/")
            "vadodara" -> webView.loadUrl("https://covidbaroda.com/")
            "nagpur" -> webView.loadUrl("http://nsscdcl.org/covidbeds/AvailableHospitals.jsp")
            "nashik" -> webView.loadUrl("https://covidnashik.com/")
            "madhyapradesh" -> webView.loadUrl("https://covidmp.com/")
            "uttarpradesh" -> webView.loadUrl("http://dgmhup.gov.in/en/CovidReport")
            "rajasthan" -> webView.loadUrl("https://covidinfo.rajasthan.gov.in/COVID19HOSPITALBEDSSTATUSSTATE.aspx")
            "bhopal" -> webView.loadUrl("https://bhopalcovidbeds.in/")
            "haryana" -> webView.loadUrl("https://coronaharyana.in/")
            "tamilnadu" -> webView.loadUrl("https://covidtnadu.com/")
            "gandhinagar" -> webView.loadUrl("https://covidgandhinagar.com/")
            "beed" -> webView.loadUrl("https://covidbeed.com/")


            else -> webView.loadUrl("https://google.com/")
        }

    }
}