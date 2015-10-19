package com.example.administrator.mytingyun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.networkbench.agent.impl.NBSAppAgent;
public class MainActivity extends AppCompatActivity {


    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NBSAppAgent.setLicenseKey("be1489182d1b48fcb62b6e7a9b8e6041").withLocationServiceEnabled(true).start(this);

        webview = (WebView) findViewById(R.id.web);
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        webview.loadUrl("http://www.baidu.com");

    }
}
