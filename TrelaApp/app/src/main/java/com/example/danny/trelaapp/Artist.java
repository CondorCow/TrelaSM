package com.example.danny.trelaapp;

import java.util.ArrayList;

/**
 * Created by Jan on 31-3-2016.
 */
public class Artist
{
    private String Name;
    private String Info;
    private ArrayList<Concert> ConcertList;
    private boolean Following;

    public Artist(String name, String info, ArrayList<Concert> concertList)
    {
        Name = name;
        Info = info;
        ConcertList = concertList;
        Following = false;
    }

    public ArrayList<Concert> getConcertList() {
        return ConcertList;
    }

    public String getName() {
        return Name;
    }

    public String getInfo() {

        return Info;
    }

    public boolean isFollowing() {
        return Following;
    }

    public void setFollowing(boolean following) {
        Following = following;
    }

    @Override
    public String toString()
    {
        return Name;
    }
}
