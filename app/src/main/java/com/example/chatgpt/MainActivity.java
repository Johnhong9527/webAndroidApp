package com.example.chatgpt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d("ning", "onCreated");
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        JSBridge.
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
        webSettings.setSupportZoom(false); // 支持缩放
        webSettings.setBlockNetworkImage(false); // 解决图片不显示
//        myWebView.loadUrl("https://www.baidu.com");
        String url = "file:///android_asset/index.html";
//        myWebView.loadUrl("https://www.baidu.com");
        myWebView.loadUrl(url);

//        WebView myWebView = new WebView(activityContext);
//        setContentView(myWebView);
    }
}