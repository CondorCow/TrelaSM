package com.example.danny.trelaapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.danny.trelaapp.Artist;
import com.example.danny.trelaapp.R;

import java.util.ArrayList;

/**
 * Created by Jan on 15-4-2016.
 */
public class ArtistsAdapter extends BaseAdapter {

    private ArrayList<Artist> artists = null;
    private Context context;

    public ArtistsAdapter(ArrayList<Artist> artists, Context context) {
        this.artists = artists;
        this.context = context;
    }

    @Override
    public int getCount() {
        return artists.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        final View customView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        Artist tempArtist = artists.get(position);

        TextView text = (TextView) customView.findViewById(android.R.id.text1);
        text.setText(tempArtist.getName());

        if(tempArtist.isFollowing())
        {
            customView.setBackgroundResource(R.color.colorSelected);
        }
        else
        {
            customView.setBackgroundResource(R.color.colorWhite);
        }

        return customView;
    }
}
