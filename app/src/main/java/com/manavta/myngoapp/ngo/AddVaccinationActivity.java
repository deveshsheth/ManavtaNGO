package com.manavta.myngoapp.ngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.NGOPlasmaDonorFragment;
import com.manavta.myngoapp.ngo.Fragment.NGOVaccinationFragment;

public class AddVaccinationActivity extends AppCompatActivity {

    TextInputLayout name,age,gender,dateofbirth,adharcard;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vaccination);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        dateofbirth = findViewById(R.id.dateofbirth);
        adharcard = findViewById(R.id.adharcard);
        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AddVaccinationActivity.this, NGOVaccinationFragment.class);
                startActivity(i);
            }
        });

    }
}