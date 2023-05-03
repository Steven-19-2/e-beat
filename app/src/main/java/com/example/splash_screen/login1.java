package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.lang.reflect.Array;

public class login1 extends AppCompatActivity {


    TextInputLayout user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        TextInputLayout user,password;
        user = findViewById(R.id.username1text);
        password = findViewById(R.id.passwordtext);

        Button login = this.findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            String user_ = user.getEditText().getText().toString();
            String password_ = password.getEditText().getText().toString();

            



                                     @Override
                                     public void onClick(View v) {
                                         Intent numbersIntent = new Intent(login1.this, dashboard.class);
                                         startActivity(numbersIntent);
                                     }

                                 }
        );



        TextView t1 = this.findViewById(R.id.signuptext);
        t1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent numbersIntent = new Intent(login1.this, login.class);
                                      startActivity(numbersIntent);
                                  }

                              }
        );








    }


}