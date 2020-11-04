package com.example.android.newsapp;

public class News {
    private String mTitle;
    private String mSection;
    private String mURL;
    private String mDate;
    private String[] mAuthors;

    public News(String mTitle, String mSection, String mURL, String mDate, String[] mAuthors) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mURL = mURL;
        this.mDate = mDate;
        this.mAuthors = mAuthors;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getURL() {
        return mURL;
    }

    public String getDate() {
        return mDate;
    }

    public String[] getAuthors() {
        return mAuthors;
    }
}
