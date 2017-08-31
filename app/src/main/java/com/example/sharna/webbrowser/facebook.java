package com.example.sharna.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class facebook extends AppCompatActivity {

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        wb = (WebView)findViewById(R.id.webview);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://facebook.com");

    }
}
