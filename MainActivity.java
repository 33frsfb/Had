package com.example.activity_31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     ImageView v;
     Button nxt;
     Button prev;
     boolean flag;
     int images[]={R.drawable.img1,R.drawable.img2};
     int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "App just created", Toast.LENGTH_SHORT).show();
        v = findViewById(R.id.iv);
        nxt = findViewById(R.id.next);
        prev = findViewById(R.id.previous);

        flag = true;

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = (i - 1) % images.length;
                if (i < 0) {
                    i = i + images.length;
                    v.setImageResource(images[i]);
                }
            }
        });

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = (i + 1) % images.length;
                v.setImageResource(images[i]);
            }
        });

        WebView myweb = findViewById(R.id.web);
        myweb.loadUrl("https://google.com");
        myweb.getSettings().setJavaScriptEnabled(true);
        myweb.setWebViewClient(new WebViewClient());

       }

        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this, "ACTIVITY STARTED", Toast.LENGTH_LONG).show();
        }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ACTIVITY PAUSED", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ACTIVITY RESUMED", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ACTIVITY STOPPED", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ACTIVITY DESTROYED", Toast.LENGTH_LONG).show();
    }






}