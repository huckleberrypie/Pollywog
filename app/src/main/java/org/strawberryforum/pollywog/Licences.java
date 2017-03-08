package org.strawberryforum.pollywog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Licences extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licence);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://creativecommons.org/publicdomain/zero/1.0/");
    }
}