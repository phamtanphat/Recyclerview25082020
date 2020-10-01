package com.example.recyclerview25082020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvMovie;
    MovieAdapter mMovieAdapter;
    List<Movie> mArrayMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvMovie = findViewById(R.id.recyclerview);

        // Khai bao data gia cho mang
        mArrayMovie = new ArrayList<>();
        mArrayMovie.add(new Movie("RÒM",R.drawable.phim_rom,"HD"));
        mArrayMovie.add(new Movie("GIA ĐÌNH CHÂN TO PHIÊU LƯU KÝ",R.drawable.phim_chan_to_phieu_luu_ky,"CAM"));
        mArrayMovie.add(new Movie("DINH THỰ XÁC SỐNG",R.drawable.phim_dinh_thu_xac_song,"HD"));
        mArrayMovie.add(new Movie("MƯỢN XÁC",R.drawable.phim_muon_xac,"HD"));
        mArrayMovie.add(new Movie("PHÒNG THỦ ĐỊA CẦU",R.drawable.phim_phong_thu_dia_cau,"HD"));

        mMovieAdapter = new MovieAdapter(mArrayMovie);

        mRcvMovie.setLayoutManager(new GridLayoutManager(this,2));
        mRcvMovie.setAdapter(mMovieAdapter);
    }

}