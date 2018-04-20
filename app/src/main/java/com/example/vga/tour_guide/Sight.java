package com.example.vga.tour_guide;

/**
 * Created by vga on 17-Apr-18.
 */

public class Sight {

private int mSightImage;
private int mSightTitle;
private int mSightLocation;
private int mSightCategory;
private int mSightShortDesc;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

public Sight (int sightImage, int sightTitle,int sightShortDesc, int sightCategory,  int sightLocation){

    mSightImage = sightImage;
    mSightTitle = sightTitle;
    mSightLocation = sightLocation;
    mSightCategory = sightCategory;
    mSightShortDesc = sightShortDesc;




}

    public int getSightImage() {
        return mSightImage;
    }

    public int getSightTitle() {
        return mSightTitle;
    }

    public int getSightLocation() {
        return mSightLocation;
    }

    public int getSightCategory() {
        return mSightCategory;
    }

    public int getSightShortDesc() {
        return mSightShortDesc;
    }
}
