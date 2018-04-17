package com.example.vga.tour_guide;

/**
 * Created by vga on 17-Apr-18.
 */

public class Sight {

private int mSightImage;
private String mSightTitle;
private String mSightLocation;
private String mSightCategory;
private String mSightShortDesc;

public Sight (int sightImage, String sightTitle, String sightLocation, String sightCategory, String sightShortDesc){

    mSightImage = sightImage;
    mSightTitle = sightTitle;
    mSightLocation = sightLocation;
    mSightCategory = sightCategory;
    mSightShortDesc = sightShortDesc;




}

    public int getmSightImage() {
        return mSightImage;
    }

    public String getmSightTitle() {
        return mSightTitle;
    }

    public String getmSightLocation() {
        return mSightLocation;
    }

    public String getmSightCategory() {
        return mSightCategory;
    }

    public String getmSightShortDesc() {
        return mSightShortDesc;
    }
}
