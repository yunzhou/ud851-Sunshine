package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDetailWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDetailWeatherData = (TextView) findViewById(R.id.tv_detail_weather_data);
        if(getIntent().hasExtra(Intent.EXTRA_TEXT)){
            String detailWeather = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            mDetailWeatherData.setText(detailWeather);
        }

        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}