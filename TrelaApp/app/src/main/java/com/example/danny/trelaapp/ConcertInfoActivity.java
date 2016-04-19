package com.example.danny.trelaapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ConcertInfoActivity extends AppCompatActivity {
    Concert thisConcert = null;
    TextView txtGoingOrNot;
    Button btnGoingCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_info);



        final TextView txtConcertName = (TextView) findViewById(R.id.txtConcertName);
        final TextView txtConcertInfo = (TextView) findViewById(R.id.txtConcertInfo);
        final TextView txtArtist = (TextView) findViewById(R.id.txtArtist);
        final TextView txtDate = (TextView) findViewById(R.id.txtDate);
        Button btnBack = (Button) findViewById(R.id.btnBackConcert);
        txtGoingOrNot = (TextView) findViewById(R.id.txtGoingOrNot);
        btnGoingCancel = (Button) findViewById(R.id.btnGoingCancel);

        thisConcert = getIntent().getParcelableExtra("concert");
        txtConcertName.setText(thisConcert.getName());
        txtConcertInfo.setText(thisConcert.getInfo());
        txtDate.setText("Date: " + thisConcert.getConcertDate());

        txtArtist.setText(thisConcert.getName());

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        UpdateInfo();

        btnGoingCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean Check = false;

                for(Concert c : Profile.myConcerts)
                {
                    if(c.getName().equals(thisConcert.getName()))
                    {
                        Profile.RemoveFromMyConcerts(c);
                        Check = true;
                    }
                }
                if(!Check)
                {
                    Profile.AddToMyConcerts(thisConcert);
                }
                UpdateInfo();
            }
        });


    }

    public void UpdateInfo()
    {
        boolean Check = false;
        for(Concert c : Profile.myConcerts)
        {
            if(c.getName().equals(thisConcert.getName()))
            {
                txtGoingOrNot.setText("You're going to this concert!");
                btnGoingCancel.setText("Cancel");
                Check = true;
            }
        }
        if(!Check)
        {
            txtGoingOrNot.setText("You're not going to this concert.");
            btnGoingCancel.setText("Go!");
        }
    }


    }


