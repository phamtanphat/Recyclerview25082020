package com.example.recyclerview25082020;

import androidx.appcompat.app.AppCompatActivity;
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
//        mArrayMovie = new ArrayList<>();
//        mArrayMovie.add(new Movie("RÒM",R.drawable.phim_rom,"HD"));
        mArrayMovie = Movie.getDataMock();
    }

}