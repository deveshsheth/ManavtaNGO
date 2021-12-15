package com.manavta.myngoapp.ngo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.PlasmaDonorNGO;
import com.manavta.myngoapp.ngo.Fragment.VaccinationNGO;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NGOVaccinationAdapter extends RecyclerView.Adapter<NGOVaccinationAdapter.MyViewHolder> {

    private List<VaccinationNGO> moviesList;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);

        }
    }

    public NGOVaccinationAdapter(List<VaccinationNGO> moviesList) {
        this.moviesList = moviesList;
    }

    @NonNull
    @NotNull
    @Override
    public NGOVaccinationAdapter.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vaccine_ngo_row, parent, false);

        return new NGOVaccinationAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NGOVaccinationAdapter.MyViewHolder holder, int position) {

        VaccinationNGO movie = moviesList.get(position);
        holder.title.setText(movie.getStrVaccination());


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
