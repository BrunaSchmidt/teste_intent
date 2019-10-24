package com.example.myapplicationteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText txtAge;
    EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtAge = (EditText) findViewById(R.id.age);
        txtName = (EditText) findViewById(R.id.name);

       Bundle args = getIntent().getBundleExtra("args_tela1");

        if(args != null){

            String age = args.getString("age");
            String name = args.getString("name");

            txtAge.setText(name);
            txtName.setText(name);

        }


    }
}
