package com.pnuema.android.coviSolution.main_stuff

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R

class AvailAct2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avail_others)

        val webView1 = findViewById<View>(R.id.webview1) as WebView
        webView1.settings.javaScriptEnabled = true
        webView1.settings.javaScriptCanOpenWindowsAutomatically = true

        webView1.loadUrl("https://www.moneycontrol.com/news/india/covid-19-here-is-a-list-of-websites-displaying-availability-of-hospital-beds-in-your-state-6858151.html");
    }
}