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
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyConcertsActivity extends AppCompatActivity {

    ArrayAdapter<Concert> adapt;
    TextView txtEmpty = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_concerts);
        final ListView listview = (ListView)findViewById(R.id.listMyConcerts);
        txtEmpty = (TextView) findViewById(R.id.txtNoMyConcerts);

        adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Profile.myConcerts);
        listview.setAdapter(adapt);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/UltraBeams.ttf");
        txtEmpty.setTypeface(myTypeface);

        if(Profile.myConcerts.isEmpty())
        {
            txtEmpty.setVisibility(View.VISIBLE);
        }
        else
        {
            txtEmpty.setVisibility(View.INVISIBLE);
        }

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ConcertInfoActivity.class);
                Concert concert = Profile.myConcerts.get(position);
                intent.putExtra("concert", concert);
                startActivity(intent);
            }
        });

        ImageButton btnOverview = (ImageButton) findViewById(R.id.btnOverview);
        btnOverview.setOnClickListener(new MenuBar());

        ImageButton btnArtists = (ImageButton) findViewById(R.id.btnArtists);
        btnArtists.setOnClickListener(new MenuBar());

        ImageButton btnSettings = (ImageButton) findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new MenuBar());

        ImageButton btnConcerts = (ImageButton) findViewById(R.id.btnConcerts);
        btnConcerts.setBackgroundResource(R.color.colorWhite);


    }

    @Override
    public void onResume()
    {
        super.onResume();
        adapt.notifyDataSetChanged();
        if(Profile.myConcerts.isEmpty())
        {
            txtEmpty.setVisibility(View.VISIBLE);
        }
        else
        {
            txtEmpty.setVisibility(View.INVISIBLE);
        }

    }



}
