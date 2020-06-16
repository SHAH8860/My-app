package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText Email,Password;
    Button Login,SinUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Email=findViewById(R.id.editTextTextEmailAddress);
        Password=findViewById(R.id.editTextTextPassword);
        Login=findViewById(R.id.button2);
        SinUp=findViewById(R.id.button3);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(a);

            }
        });
        SinUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(a);


            }
        });
    }
}