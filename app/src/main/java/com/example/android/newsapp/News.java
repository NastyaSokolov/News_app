package com.example.android.newsapp;

public class News {
    private String mTitle;
    private String mSection;
    private String mURL;
    private String mDate;

    public News(String mTitle, String mSection, String mURL, String mDate) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mURL = mURL;
        this.mDate = mDate;
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
}
