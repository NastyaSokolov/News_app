package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, @NonNull List<News> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);
        assert currentNews != null;
        String newsTitle = currentNews.getTitle();
        String newsSection = currentNews.getSection();
        String newsDate = currentNews.getDate();
        String date = "";
        String time = "";
        Pattern patternDate = Pattern.compile("(\\d*-\\d*-\\d*)");
        Pattern patternTime = Pattern.compile("(\\d*:\\d*:\\d*)");
        Matcher matcherDate = patternDate.matcher(newsDate);
        Matcher matcherTime = patternTime.matcher(newsDate);
        if (matcherDate.find()) {
            date = matcherDate.group();
        }
        if (matcherTime.find()) {
            time = matcherTime.group();
        }
        ((TextView) listItemView.findViewById(R.id.section)).setText(newsSection);
        ((TextView) listItemView.findViewById(R.id.title)).setText(newsTitle);
        ((TextView) listItemView.findViewById(R.id.date)).setText(date);
        ((TextView) listItemView.findViewById(R.id.time)).setText(time);
        return listItemView;
    }
}
