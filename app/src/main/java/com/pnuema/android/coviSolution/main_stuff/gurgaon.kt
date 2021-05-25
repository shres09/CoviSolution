package com.pnuema.android.coviSolution.main_stuff

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R

class gurgaon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avail_others)

        val webView1 = findViewById<View>(R.id.webview1) as WebView
        webView1.settings.javaScriptEnabled = true
        webView1.settings.javaScriptCanOpenWindowsAutomatically = true

        webView1.loadUrl("http://covidggn.com/");
    }
}