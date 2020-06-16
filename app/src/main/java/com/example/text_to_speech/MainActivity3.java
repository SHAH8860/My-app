package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity3 extends AppCompatActivity {
    EditText UserName,Email,Password,PhoneNumber;
    Button  Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        UserName=findViewById(R.id.editTextTextPersonName);
        Email=findViewById(R.id.editTextTextEmailAddress2);
        Password=findViewById(R.id.editTextTextPassword2);
        PhoneNumber=findViewById(R.id.editTextPhone);
        Register=findViewById(R.id.button4);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=Email.getText().toString().trim();
                String password=Password.getText().toString().trim();
                if(TextUtils.isEmpty(email)){
                    Email.setError("Email is required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Password.setError("Password is required");
                    return;
                }
                Intent a=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(a);

            }
        });

    }
}