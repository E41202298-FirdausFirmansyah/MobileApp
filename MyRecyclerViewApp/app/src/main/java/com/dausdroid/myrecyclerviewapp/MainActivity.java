package com.dausdroid.myrecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objMovies.add(new Movies("Avengers: Infinity War (2018)", "Action, Adventure, Sci-Fi", "Anthony Russo", 8.4, "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.", "4 Mei 2012"));
        objMovies.add(new Movies("Guardians of the Galaxy (2014)", "Action, Adventure, Comedy, Sci-Fi", "James Gunn", 8.0, "A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.", "8 Januari 2014"));
        objMovies.add(new Movies("Captain America: Civil War (2016)", "Action, Adventure, Sci-Fi", "Anthony Russo, Joe Russo", 7.8, "TPolitical involvement in the Avengers' affairs causes a rift between Captain America and Iron Man.", "6 Mei 2016"));
        objMovies.add(new Movies("Doctor Strange (2016)", "Action, Adventure, Fantasy, Sci-Fi", "Scott Derrickson", 7.5, "While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts.", "4 November 2016"));
        objMovies.add(new Movies("Spider-Man: Homecoming (2017)", "Action, Adventure, Sci-Fi", "Jon Watts", 7.4, "Peter Parker balances his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New York City.", "7 Juli 2017"));
        objMovies.add(new Movies("Ant-Man (2015)", "Action, Adventure, Comedy, Sci-Fi", "Peyton Reed", 7.3, "Armed with a super-suit with the astonishing ability to shrink in scale but increase in strength, cat burglar Scott Lang must embrace his inner hero and help his mentor, Dr. Hank Pym, pull off a plan that will save the world.", "17 Juli 2015"));
        objMovies.add(new Movies("Iron Man Three (2013)", "Action, Adventure, Sci-Fi", "Shane Black", 7.1, "When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution.", "26 April 2013"));

        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}