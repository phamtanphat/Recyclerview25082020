package com.example.recyclerview25082020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    private String name;
    private Integer image;
    private String qualify;

    // alt + insert : generate chuc nang
    public Movie(String name, Integer image, String qualify) {
        this.name = name;
        this.image = image;
        this.qualify = qualify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getQualify() {
        return qualify;
    }

    public void setQualify(String qualify) {
        this.qualify = qualify;
    }

//    public static List<Movie> getDataMock(){
//        return new ArrayList<>(Arrays.asList(
//           new Movie("RÒM",R.drawable.phim_rom,"HD")
//        ));
//    }
}
