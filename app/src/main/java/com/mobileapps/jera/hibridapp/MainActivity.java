package com.mobileapps.jera.hibridapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;
    ProgressBar mLoading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView)findViewById(R.id.wvPortal);

        mLoading = (ProgressBar) findViewById(R.id.pbLoading);

        mWebView.loadUrl("file:///android_asset/www/index.html");

        WebSettings mWebSettings = mWebView.getSettings();

        mWebSettings.setJavaScriptEnabled(true);


    }
}
