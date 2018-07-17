package com.example.a17045679.basicmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MathItem> alMovieList;
    CustomeAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listView);
        alMovieList = new ArrayList<>();

        MathItem movie1 = new MathItem("Area of rectangle", "Length x Length", "Fomula type is: Area");
        MathItem movie2 = new MathItem("Area of triangle", "(Length of base x Length)/2", "Fomula type is: Area");
        MathItem movie3 = new MathItem("Volume of cube", "Length x Length x Length", "Fomula type is: Volume");

        alMovieList.add(movie1);
        alMovieList.add(movie2);
        alMovieList.add(movie3);


        caMovie = new CustomeAdapter(this, R.layout.math_item, alMovieList);

        lvMovie.setAdapter(caMovie);
    }
}
