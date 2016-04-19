package com.example.danny.trelaapp;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Jan on 7-4-2016.
 */
public class Concert implements Parcelable
{
    private String Name;
    private String Info;
    private int KmFromHome;
    private String ConcertDate;

    public Concert(String name, String info, int kmFromHome, String concertDate)
    {
        Name = name;
        Info = info;
        KmFromHome = kmFromHome;
        ConcertDate = concertDate;
    }

    protected Concert(Parcel in) {
        Name = in.readString();
        Info = in.readString();
        KmFromHome = in.readInt();
        ConcertDate = in.readString();
    }

    public static final Creator<Concert> CREATOR = new Creator<Concert>() {
        @Override
        public Concert createFromParcel(Parcel in) {
            return new Concert(in);
        }

        @Override
        public Concert[] newArray(int size) {
            return new Concert[size];
        }
    };

    public int getKmFromHome()
    {
        return KmFromHome;
    }

    public String getConcertDate()
    {
        return ConcertDate;
    }

    public String getName()
    {
        return Name;
    }

    public String getInfo()
    {
        return Info;
    }

    @Override
    public String toString()
    {
        return Name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Info);
        dest.writeInt(KmFromHome);
        dest.writeString(ConcertDate);
    }
}
