package com.example.asus.dayane_1202154316_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    private static int splashInterval = 3000;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Toast.makeText(SplashActivity.this, "DAYANE_1202154316", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent splash = new Intent( SplashActivity.this, MainActivity.class);
                                          startActivity(splash);

                                          this.finish();
                                      }

                                      private void finish () {

                                      }
                                  },
                splashInterval);
    };
}

