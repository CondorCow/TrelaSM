package com.example.danny.trelaapp;

import android.app.TabActivity;
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
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;

public class OverviewActivity extends AppCompatActivity {

    public static Profile profile = new Profile(150,"Jon");
    public static DataBase dataBase = new DataBase();
    public ArrayList<Concert> nearbyConcerts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        nearbyConcerts = DataBase.GetNearbyConcerts();

        final TextView txtNoConcerts = (TextView) findViewById(R.id.txtNoConcerts);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/UltraBeams.ttf");
        txtNoConcerts.setTypeface(myTypeface);
        if(nearbyConcerts.isEmpty())
        {
            txtNoConcerts.setVisibility(View.VISIBLE);
        }
        else
        {
            txtNoConcerts.setVisibility(View.INVISIBLE);
        }

        final ListView listview = (ListView)findViewById(R.id.overviewList);

        ArrayAdapter<Concert> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nearbyConcerts);
        listview.setAdapter(adapt);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ConcertInfoActivity.class);
                Concert concert = nearbyConcerts.get(position);
                intent.putExtra("concert", concert);
                startActivity(intent);
            }
        });

        ImageButton btnArtists = (ImageButton) findViewById(R.id.btnArtists);
        btnArtists.setOnClickListener(new MenuBar());

        ImageButton btnConcerts = (ImageButton) findViewById(R.id.btnConcerts);
        btnConcerts.setOnClickListener(new MenuBar());

        ImageButton btnSettings = (ImageButton) findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new MenuBar());

        ImageButton btnOverview = (ImageButton) findViewById(R.id.btnOverview);
        btnOverview.setBackgroundResource(R.color.colorWhite);

    }

}
