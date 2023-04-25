package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import  android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        RelativeLayout rl = (RelativeLayout) findViewById(R.id.sr1);
        rl.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, beatofficerdetails.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );

    }
}