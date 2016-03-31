package com.example.danny.trelaapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Jan on 31-3-2016.
 */
public class MenuBar implements ImageButton.OnClickListener
{
    private static final String TAG = "MenuBar";

    public void DoIntentTransition(Context packageContext, Class<?> cls)
    {
        Intent intent = new Intent(packageContext, cls);
        packageContext.startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnOverview:
                DoIntentTransition(v.getContext(), OverviewActivity.class);
                break;
            case R.id.btnArtists:
                DoIntentTransition(v.getContext(), ArtistsActivity.class);
                break;
            case R.id.btnConcerts:
                DoIntentTransition(v.getContext(), MyConcertsActivity.class);
                break;
            case R.id.btnSettings:
                DoIntentTransition(v.getContext(), SettingsActivity.class);
                break;
        }
    }
}
