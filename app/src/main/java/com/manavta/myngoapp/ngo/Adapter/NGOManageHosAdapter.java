package com.manavta.myngoapp.ngo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.HospitalNGO;

import java.util.List;

public class NGOManageHosAdapter extends RecyclerView.Adapter<NGOManageHosAdapter.MyViewHolder> {

    private List<HospitalNGO> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        ImageView imageData;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            imageData = (ImageView) view.findViewById(R.id.img_hospital);
        }
    }


    public NGOManageHosAdapter(List<HospitalNGO> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hospital_ngo_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        HospitalNGO movie = moviesList.get(position);
        holder.title.setText(movie.getStrhospital());
        holder.imageData.setImageResource(movie.getImgHospital());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
