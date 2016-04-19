package com.example.danny.trelaapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtistsActivity extends AppCompatActivity {

    //ArrayList<Artist> artists = new ArrayList<Artist>();
    //ArrayList<Concert> tempConcerts = new ArrayList<Concert>();

    //static Profile profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView arrow = (ImageView) findViewById(R.id.arrow);
        TextView txtEmpty = (TextView) findViewById(R.id.txtEmpty);
        ListView listview = (ListView)findViewById(R.id.listView);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/UltraBeams.ttf");
        txtEmpty.setTypeface(myTypeface);

        ArrayAdapter<Artist> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Profile.followingArtists);
        listview.setAdapter(adapt);

        if(Profile.followingArtists.isEmpty())
        {
            arrow.setVisibility(View.VISIBLE);
            txtEmpty.setVisibility(View.VISIBLE);
        }
        else
        {
            arrow.setVisibility(View.INVISIBLE);
            txtEmpty.setVisibility(View.INVISIBLE);
        }


        Button btnAddArtists = (Button) findViewById(R.id.btnAddArtist);
        btnAddArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddArtistActivity.class));
            }
        });


        ImageButton btnOverview = (ImageButton) findViewById(R.id.btnOverview);
        btnOverview.setOnClickListener(new MenuBar());

        ImageButton btnConcerts = (ImageButton) findViewById(R.id.btnConcerts);
        btnConcerts.setOnClickListener(new MenuBar());

        ImageButton btnSettings = (ImageButton) findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new MenuBar());

        ImageButton btnArtists = (ImageButton) findViewById(R.id.btnArtists);
        btnArtists.setBackgroundResource(R.color.colorWhite);

    }
}
