package com.example.danny.trelaapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class AddArtistActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_artist);

        ListView listview = (ListView)findViewById(R.id.allArtists);

        final ArtistsAdapter adapt = new ArtistsAdapter(DataBase.artists, this);
        listview.setAdapter(adapt);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Artist selectedArtist = DataBase.artists.get(position);
                if (!Profile.followingArtists.contains(selectedArtist))
                {
                    Profile.AddArtist(DataBase.artists.get(position));
                    DataBase.artists.get(position).setFollowing(true);
                }
                else
                {
                    Profile.DeleteArtists(DataBase.artists.get(position));
                    DataBase.artists.get(position).setFollowing(false);
                }
                adapt.notifyDataSetChanged();
            }
        });

        Button btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ArtistsActivity.class));
            }
        });

    }

}
