package com.example.lisonglin.weatherapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class WeatherMainActivity extends Activity {
    private FrameLayout ActivityMainBG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_main);

        changeActivityMainBG();


    }

public void changeActivityMainBG(){
    ActivityMainBG =(FrameLayout)findViewById(R.id.MainBg);
    ActivityMainBG.setBackground(this.getResources().getDrawable(R.drawable.weather_cloudy_night));
}

}
