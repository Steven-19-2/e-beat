package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class beatofficerdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beatofficerdetails);

        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener()
                                   {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(beatofficerdetails.this,details.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );
    }
}

