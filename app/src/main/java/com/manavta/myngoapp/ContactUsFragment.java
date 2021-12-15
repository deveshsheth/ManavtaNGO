package com.manavta.myngoapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.jetbrains.annotations.NotNull;

public class ContactUsFragment extends Fragment {

    EditText edtFirstName;
    EditText edtLastName;
    EditText edtEmail;
    EditText edtContactNo;
    EditText edtMessage;
    Button btnSubmit;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_contact_us, container, false);

        edtFirstName = rootView.findViewById(R.id.edt_name2);
        edtEmail = rootView.findViewById(R.id.edt_email2);
        edtContactNo= rootView.findViewById(R.id.edt_contact2);
        edtMessage= rootView.findViewById(R.id.edt_message2);
        btnSubmit= rootView.findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
        String strfn = edtFirstName.getText().toString();
        String strln = edtLastName.getText().toString();
        String strEmail = edtEmail.getText().toString();
        String strContact = edtContactNo.getText().toString();
        String strMessage = edtMessage.getText().toString();

        }
        });

        return  rootView;

    }

}