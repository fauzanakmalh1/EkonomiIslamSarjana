package com.example.ekonomiislamsarjana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;
    private String url = "file:///android_asset/index.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);

        myWebView = findViewById(R.id.content_view);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl(url);
    }
}