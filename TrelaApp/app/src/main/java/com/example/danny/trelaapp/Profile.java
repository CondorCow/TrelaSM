package com.example.danny.trelaapp;

import android.location.Location;

import java.util.ArrayList;

/**
 * Created by Jan on 7-4-2016.
 */
public class Profile
{
    public static ArrayList<Artist> followingArtists = new ArrayList<Artist>();
    public static ArrayList<Concert> myConcerts = new ArrayList<Concert>();
    public static ArrayList<Concert> nearbyConcerts = new ArrayList<Concert>();
    
    private static int rangeInKm;
    private static String name;

    public Profile(int rangeInKm, String name)
    {
        this.rangeInKm = rangeInKm;
        this.name = name;
    }

    public static int getRangeInKm() {
        return rangeInKm;
    }

    public static void setRangeInKm(int RangeInKm)
    {
        rangeInKm = RangeInKm;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String Name) {
        name = Name;
    }

    public static void AddArtist(Artist artist)
    {
        followingArtists.add(artist);
    }
    
    public static void DeleteArtists(Artist artist)
    {
        followingArtists.remove(artist);
    }
    
    
    public static void AddToMyConcerts(final Concert concert)
    {
        myConcerts.add(concert);
    }
    
    public static void RemoveFromMyConcerts(Concert concert)
    {
        myConcerts.remove(concert);
    }
    
    public static void AddNearbyConcert(Concert concert)
    {
        nearbyConcerts.add(concert);
    }

    public static void DelectNearbyConcert(Concert concert)
    {
        nearbyConcerts.remove(concert);
    }
    
    
    
    
}
