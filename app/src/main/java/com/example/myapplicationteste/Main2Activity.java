package com.example.myapplicationteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String user_name = intent.getStringExtra("USER_NAME");
        String user_age = intent.getStringExtra("USER_AGE");
        startActivity(intent);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){

            user_name = bundle.getString("USER_NAME");
            user_age = bundle.getString("USER_AGE");

        }


    }
}
