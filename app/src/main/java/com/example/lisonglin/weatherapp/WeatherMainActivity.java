package com.example.lisonglin.weatherapp;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class WeatherMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_main);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        //actionBar.setDisplayShowCustomEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setSplitBackgroundDrawable(getResources().getDrawable(R.drawable.bg_splitactionbar));
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.weather_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
        
        case R.id.action_qushi:


            break;
        case R.id.action_zhishu:


            break;
        case R.id.action_shuaxin:


            break;
            
        default:
            break;
        }
        return true;
        
    }
}
