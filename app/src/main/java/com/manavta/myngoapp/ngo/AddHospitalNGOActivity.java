package com.manavta.myngoapp.ngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.NGOHospitalFragment;

public class AddHospitalNGOActivity extends AppCompatActivity {

    TextInputEditText hospitalname,numberofbeds,hospitalphno,address,pincode;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hospital_ngoactivity);

        hospitalname = findViewById(R.id.edt_hospitalname);
        numberofbeds = findViewById(R.id.edit_numberofbeds);
        hospitalphno = findViewById(R.id.edt_hospitalphno);
        address = findViewById(R.id.edt_address);
        pincode = findViewById(R.id.edt_pincode);
        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String hn = hospitalname.getText().toString();
                String nob = numberofbeds.getText().toString();
                String hp = hospitalphno.getText().toString();
                String add = address.getText().toString();
                String pin = pincode.getText().toString();
                if(hn.equals("")){
                    hospitalname.setError("Enter HospitalName....");
                } else if(nob.equals("")){
                       numberofbeds.setError("Enter No of beds");
                }
                else if(hp.equals("")){
                    hospitalphno.setError("Enter phone Number");
                }
                else if(add.equals("")){
                    address.setError("Enter Address");
                }
                else if(pin.equals("")){
                    pincode.setError("Enter Pincode");
                }
                else {
                    Intent i = new Intent(AddHospitalNGOActivity.this, NGOHospitalFragment.class);
                    startActivity(i);
                }




            }
        });





    }
}