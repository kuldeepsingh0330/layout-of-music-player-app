package com.ransankul.music.Activities;

import static com.ransankul.music.R.drawable.splashbg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.ransankul.music.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent dap = new Intent(SplashActivity.this,MainActivity .class);
                    startActivity(dap);
                    finish();

                }
            },3000);

        getWindow().setStatusBarColor(this.getResources().getColor(R.color.stausbarsplash));
        }
    }
