package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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


        RelativeLayout r1 = (RelativeLayout) findViewById(R.id.sr1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(dashboard.this, beatofficerdetails.class);
                startActivity(numbersIntent);
            }

        }
        );

        RelativeLayout r2 = (RelativeLayout) findViewById(R.id.sr2);
        r2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, governoffices.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );

        RelativeLayout r3 = (RelativeLayout) findViewById(R.id.sr3);
        r3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, educationalinstitutions.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );

        RelativeLayout r4 = (RelativeLayout) findViewById(R.id.sr4);
        r4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, placesworship.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );

        RelativeLayout r5 = (RelativeLayout) findViewById(R.id.sr5);
        r5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, guesthotelrest.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );

        RelativeLayout r6 = (RelativeLayout) findViewById(R.id.sr6);
        r6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, bustaxipetrol.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );

        RelativeLayout r14 = (RelativeLayout) findViewById(R.id.sr14);
        r14.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent numbersIntent = new Intent(dashboard.this, dancingschools.class);
                                       startActivity(numbersIntent);
                                   }

                               }
        );

        RelativeLayout r15 = (RelativeLayout) findViewById(R.id.sr15);
        r15.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent numbersIntent = new Intent(dashboard.this, touristguides.class);
                                       startActivity(numbersIntent);
                                   }

                               }
        );

        RelativeLayout r16 = (RelativeLayout) findViewById(R.id.sr16);
        r16.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, crime2ormore.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );



        RelativeLayout r17 = (RelativeLayout) findViewById(R.id.sr17);
        r17.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(dashboard.this, firlist.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );
    }
}