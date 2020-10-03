package com.example.recyclerview25082020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    List<Movie> mArrayMovie;
    OnItemClick mOnItemClick;

    public MovieAdapter(List<Movie> mArrayMovie) {
        this.mArrayMovie = mArrayMovie;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_movie,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = mArrayMovie.get(position);
        holder.imgMovie.setImageResource(movie.getImage());
        holder.tvName.setText(movie.getName());
        holder.tvQualify.setText(movie.getQualify());
    }

    @Override
    public int getItemCount() {
        return mArrayMovie == null ? 0 : mArrayMovie.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder{

        ImageView imgMovie;
        TextView tvName,tvQualify;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMovie = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textviewName);
            tvQualify = itemView.findViewById(R.id.textviewqualify);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClick.onClick(getAdapterPosition());
                }
            });
        }
    }
    public void setOnClickItem(OnItemClick mOnItemClick){
        this.mOnItemClick = mOnItemClick;
    }
}
