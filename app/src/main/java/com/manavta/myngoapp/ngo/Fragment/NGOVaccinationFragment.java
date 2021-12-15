package com.manavta.myngoapp.ngo.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Adapter.NGOManagePlasmaDonorAdapter;
import com.manavta.myngoapp.ngo.Adapter.NGOVaccinationAdapter;
import com.manavta.myngoapp.ngo.AddPlasmaDonorActivity;
import com.manavta.myngoapp.ngo.AddVaccinationActivity;

import java.util.ArrayList;

public class NGOVaccinationFragment extends Fragment {

    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;
    String strVaccination[] = {"Vaccine1","Vaccine2","Vaccine3","Vaccine4","Vaccine5","Vaccine6"};
    ArrayList<VaccinationNGO> VaccinationNGOArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_ngovaccination_fragment, container, false);
        recyclerView = rootView.findViewById(R.id.recycler);
        floatingActionButton = rootView.findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddVaccinationActivity.class);
                startActivity(i);
            }
        });
        VaccinationNGOArrayList = new ArrayList<VaccinationNGO>();
        for (int i = 0 ; i<strVaccination.length; i++){

            VaccinationNGO VaccinationNGO = new VaccinationNGO(strVaccination[i]);
            VaccinationNGOArrayList.add(VaccinationNGO);
        }

        NGOVaccinationAdapter mAdapter = new NGOVaccinationAdapter(VaccinationNGOArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);




        return  rootView;
    }

}