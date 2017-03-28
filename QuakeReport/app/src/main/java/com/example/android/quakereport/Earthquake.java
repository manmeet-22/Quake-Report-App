package com.example.android.quakereport;

/**
 * Created by MANI on 1/18/2017.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake (double magnitude,String location, long timeInMilliseconds, String url){

        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds= timeInMilliseconds;
        mUrl= url;
    }

    public double getMagnitude(){return mMagnitude;}

    public String getLoction() {return mLocation;}

    public  long getTimeInMilliseconds(){ return mTimeInMilliseconds;}

    public String getUrl(){ return mUrl;}
}
