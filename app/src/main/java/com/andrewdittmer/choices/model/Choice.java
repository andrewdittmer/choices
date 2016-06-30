package com.andrewdittmer.choices.model;

/**
 * Created by andrewdittmer on 30/06/16.
 */
public class Choice {

    private String mTitle;
    private String mName;
    private String mDescription;
    private String mImageUrl;

    public Choice(String title, String name, String description, String imageUrl) {
        mTitle = title;
        mName = name;
        mDescription = description;
        mImageUrl = imageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
}
