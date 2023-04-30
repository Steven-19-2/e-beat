package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.widget.EditText;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class details extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button add;
    TextInputLayout user,phone,area;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.des,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        add = findViewById(R.id.adddatabutton);
        user = findViewById(R.id.username1text);
        phone = findViewById(R.id.phoneno);
        area = findViewById(R.id.beatarea1);


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String user1 = user.getEditText().getText().toString();
                String p1 = phone.getEditText().getText().toString();
                String a1 = area.getEditText().getText().toString();
                String sp1 = spinner.getSelectedItem().toString();//value stored in sp1


Log.d("CREATION", sp1);

                View selectedView = spinner.getSelectedView();
                if (selectedView != null && selectedView instanceof TextView) {
                    TextView selectedTextView = (TextView) selectedView;
                    selectedTextView.setError("Please select a value");
                }
                if(!user1.isEmpty())
                {
                    user.setError(null);
                    user.setErrorEnabled(false);
                }
                else
                {
                    user.setError("Please enter the username");
                }

                if(!a1.isEmpty())
                {
                    area.setError(null);
                    area.setErrorEnabled(false);
                }
                else {
                    area.setError("Please enter the beat area");
                }
                if(!p1.isEmpty())
                {
                    phone.setError(null);
                    phone.setErrorEnabled(false);
                }
                else
                {
                    phone.setError("Please enter the beat area");
                }




            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}