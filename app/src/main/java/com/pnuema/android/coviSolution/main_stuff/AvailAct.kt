package com.pnuema.android.coviSolution.main_stuff

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R

class AvailAct: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avail)

        val webView = findViewById<View>(R.id.webview) as WebView
        webView.settings.javaScriptEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true

        webView.loadUrl("https://covidbengaluru.com/");
    }
}