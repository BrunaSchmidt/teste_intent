package com.example.myapplicationteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ETname = findViewById(R.id.name);
        final EditText ETage = findViewById(R.id.age);
        Button saveButton = findViewById(R.id.sendButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ();
                String user_name = ETname.getText().toString();
                intent.putExtra("USER_NAME", user_name );
                String user_age = ETage.getText().toString();
                intent.putExtra("USER_AGE", user_age);

                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                startActivity(intent1);


            }
        });

    }
}
