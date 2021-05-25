package com.pnuema.android.coviSolution.main_stuff

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pnuema.android.coviSolution.R
import com.pnuema.android.coviSolution.R.id.bangalore
import kotlinx.android.synthetic.main.activity_avail_main.*


class AvailActMain : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bangalore: Button = findViewById(R.id.bangalore)
        val gurgaon: Button = findViewById(R.id.gurgaon)
        val  delhi : Button = findViewById(R.id.delhi)
        val andhra: Button = findViewById(R.id.andhra)
        val telengana: Button = findViewById(R.id.telengana)
        bangalore.setOnClickListener(this)
        gurgaon.setOnClickListener(this)
        delhi.setOnClickListener(this)
        andhra.setOnClickListener(this)
        telengana.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        setContentView(R.layout.activity_avail)

        when (v.getId()) {
            R.id.bangalore ->{
                val webView1 = findViewById<View>(R.id.webview1) as WebView
                webView1.settings.javaScriptEnabled = true
                webView1.settings.javaScriptCanOpenWindowsAutomatically = true
                var url = "https://covidbengaluru.com/"
                webView1.loadUrl(url);
            }
            R.id.gurgaon ->{
                val webView1 = findViewById<View>(R.id.webview1) as WebView
                webView1.settings.javaScriptEnabled = true
                webView1.settings.javaScriptCanOpenWindowsAutomatically = true
                var url = "http://covidggn.com/"
                webView1.loadUrl(url);
            }
            R.id.delhi -> {
                val webView1 = findViewById<View>(R.id.webview1) as WebView
                webView1.settings.javaScriptEnabled = true
                webView1.settings.javaScriptCanOpenWindowsAutomatically = true
                var url = "https://coviddelhi.com"
                webView1.loadUrl(url);
            }
            R.id.andhra -> {
                val webView1 = findViewById<View>(R.id.webview1) as WebView
                webView1.settings.javaScriptEnabled = true
                webView1.settings.javaScriptCanOpenWindowsAutomatically = true
                var url = "https://covidaps.com"
                webView1.loadUrl(url);
            }
            R.id.telengana ->{
                val webView1 = findViewById<View>(R.id.webview1) as WebView
                webView1.settings.javaScriptEnabled = true
                webView1.settings.javaScriptCanOpenWindowsAutomatically = true
                var url = "https://covidtelangana.com"
                webView1.loadUrl(url);
            }
        }

    }
}

