package com.manavta.myngoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainSignUp extends AppCompatActivity {

    EditText edtFirstName;
    EditText edtLastName;
    EditText edtEmail;
    EditText edtPassword;
    EditText edtDob;
    EditText edtAddress;
    EditText edtContactNo;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        edtFirstName = findViewById(R.id.edt_name2);
        edtLastName = findViewById(R.id.in_last_name2);
        edtEmail = findViewById(R.id.edt_email2);
        edtPassword = findViewById(R.id.edt_password2);
        edtDob = findViewById(R.id.edt_dob2);
        edtAddress = findViewById(R.id.edt_address2);
        edtContactNo = findViewById(R.id.edt_contact2);
        btnRegister = findViewById(R.id.btn_register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainSignUp.this,MainActivity.class);
                startActivity(i);

            }
        });
    }
}