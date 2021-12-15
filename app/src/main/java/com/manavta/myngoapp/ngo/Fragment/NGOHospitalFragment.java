package com.manavta.myngoapp.ngo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Adapter.NGOManageHosAdapter;
import com.manavta.myngoapp.ngo.AddHospitalNGOActivity;

import java.util.ArrayList;

public class NGOHospitalFragment extends Fragment {

    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;
    String strHospital[] = {"Hospital1","Hospital2","Hospital3","Hospital4","Hospital5","Hospital6"};
    int imgHospital[] = {R.drawable.ngo_1,R.drawable.ngo_2,
            R.drawable.ngo_3,R.drawable.ngo_5,
            R.drawable.ngo_1,R.drawable.ngo_3};
    ArrayList<HospitalNGO> hospitalNGOArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ngo_hospital, container, false);
        recyclerView = rootView.findViewById(R.id.recycler);
        floatingActionButton = rootView.findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddHospitalNGOActivity.class);
                startActivity(i);
            }
        });
        hospitalNGOArrayList = new ArrayList<HospitalNGO>();
        for (int i = 0 ; i<strHospital.length; i++){

            HospitalNGO hospitalNGO = new HospitalNGO(strHospital[i],imgHospital[i]);
            hospitalNGOArrayList.add(hospitalNGO);
        }

       NGOManageHosAdapter mAdapter = new NGOManageHosAdapter(hospitalNGOArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);




        return  rootView;
    }
}
