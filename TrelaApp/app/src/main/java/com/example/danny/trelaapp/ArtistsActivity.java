package com.example.danny.trelaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ArtistsActivity extends AppCompatActivity {

    MenuBar menuBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
