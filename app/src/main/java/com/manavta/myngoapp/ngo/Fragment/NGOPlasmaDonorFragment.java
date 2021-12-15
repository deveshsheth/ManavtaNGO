package com.manavta.myngoapp.ngo.Fragment;

import androidx.annotation.NonNull;
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
import com.manavta.myngoapp.ngo.AddPlasmaDonorActivity;

import java.util.ArrayList;

public class NGOPlasmaDonorFragment extends Fragment {

    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;
    String strPlasmaDonor[] = {"PlasmaDonor1","PlasmaDonor2","PlasmaDonor3","PlasmaDonor4","PlasmaDonor5","PlasmaDonor6"};
    int imgPlasmaDonor[] = {R.drawable.ngo_1,R.drawable.ngo_2,
            R.drawable.ngo_3,R.drawable.ngo_5,
            R.drawable.ngo_1,R.drawable.ngo_3};
    ArrayList<PlasmaDonorNGO> PlasmaDonorNGOArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_ngoplasma_donor_fragment, container, false);
        recyclerView = rootView.findViewById(R.id.recycler);
        floatingActionButton = rootView.findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddPlasmaDonorActivity.class);
                startActivity(i);
            }
        });
        PlasmaDonorNGOArrayList = new ArrayList<PlasmaDonorNGO>();
        for (int i = 0 ; i<strPlasmaDonor.length; i++){

            PlasmaDonorNGO PlasmaDonorNGO = new PlasmaDonorNGO(strPlasmaDonor[i],imgPlasmaDonor[i]);
            PlasmaDonorNGOArrayList.add(PlasmaDonorNGO);
        }

        NGOManagePlasmaDonorAdapter mAdapter = new NGOManagePlasmaDonorAdapter(PlasmaDonorNGOArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);




        return  rootView;
    }

}