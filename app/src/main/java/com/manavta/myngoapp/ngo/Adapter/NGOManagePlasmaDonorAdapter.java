package com.manavta.myngoapp.ngo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.HospitalNGO;
import com.manavta.myngoapp.ngo.Fragment.PlasmaDonorNGO;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NGOManagePlasmaDonorAdapter extends RecyclerView.Adapter<NGOManagePlasmaDonorAdapter.MyViewHolder> {

    private List<PlasmaDonorNGO> moviesList;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        ImageView imageData;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            imageData = (ImageView) view.findViewById(R.id.img_hospital);
        }
    }

    public NGOManagePlasmaDonorAdapter(List<PlasmaDonorNGO> moviesList) {
        this.moviesList = moviesList;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.plasma_donor_ngo_row, parent, false);

        return new NGOManagePlasmaDonorAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        PlasmaDonorNGO movie = moviesList.get(position);
        holder.title.setText(movie.getStrPlasmaDonor());
        holder.imageData.setImageResource(movie.getImgPlasmaDonor());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

}
