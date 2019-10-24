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

        final EditText editAge;
        final EditText editNome;
        Button saveButton = findViewById(R.id.sendButton);

        editAge = (EditText) findViewById(R.id.age);
        editNome = (EditText) findViewById(R.id.name);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String age = editAge.getText().toString();
                String name = editNome.getText().toString();

                Bundle args = new Bundle();
                args.putString("age", age);
                args.putString("name", name);

                Intent it = new Intent(getApplicationContext(), Main2Activity.class);
                it.putExtra("args_tela1", args);
                startActivity(it);

            }
        });

    }
}
