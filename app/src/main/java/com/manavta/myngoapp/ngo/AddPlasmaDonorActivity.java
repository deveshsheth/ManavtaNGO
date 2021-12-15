package com.manavta.myngoapp.ngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.NGOPlasmaDonorFragment;

public class AddPlasmaDonorActivity extends AppCompatActivity {

    TextInputEditText name,age,gender,bloodgroup,weight,dateofcovidpositive,dateofcovidnegative,city,state,phonenumber;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_plasma_donor);

        name = findViewById(R.id.edt_name);
        age = findViewById(R.id.edit_age);
        gender = findViewById(R.id.edt_gender);
        bloodgroup = findViewById(R.id.edt_bloodgroup);
        weight = findViewById(R.id.edt_weight);
        dateofcovidpositive = findViewById(R.id.edt_dateofcovidpositive);
        dateofcovidnegative = findViewById(R.id.edt_dateofcovidnegative);
        city = findViewById(R.id.edt_city);
        state = findViewById(R.id.edt_state);
        phonenumber = findViewById(R.id.edt_phonenumber);
        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = name.getText().toString();
                String a = age.getText().toString();
                String g = gender.getText().toString();
                String bg = bloodgroup.getText().toString();
                String w = weight.getText().toString();
                String docp = dateofcovidpositive.getText().toString();
                String docn = dateofcovidnegative.getText().toString();
                String c = city.getText().toString();
                String s= state.getText().toString();
                String phn = phonenumber.getText().toString();

                if(n.equals("")){
                    name.setError("Enter name");
                }
                else if(a.equals("")){
                    age.setError("Enter age");
                }
                else if(g.equals("")){
                    gender.setError("Enter Gender");
                }
                else if(bg.equals("")){
                    bloodgroup.setError("Enter Blood Group");
                }
                else if(w.equals("")){
                    weight.setError("Enter Weight");
                }
                else if(docp.equals("")){
                    dateofcovidpositive.setError("Enter Date of Covid Positive");
                }
                else if(docn.equals("")){
                    dateofcovidnegative.setError("Enter Date of Covid Negative");
                }
                else if(c.equals("")){
                    city.setError("Enter City");
                }
                else if(s.equals("")){
                    state.setError("Enter State");
                }
                else if(phn.equals("")){
                    phonenumber.setError("Enter Phone Number");
                }
                else {
                    Intent i = new Intent(AddPlasmaDonorActivity.this, NGOPlasmaDonorFragment.class);
                    startActivity(i);
                }



            }
        });

    }
}
