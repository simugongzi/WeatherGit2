package com.example.lisonglin.weatherapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;


public class WeatherMainActivity extends Activity {
    private RelativeLayout ActivityMainBG;

    private  FrameLayout ListFrame;//contain different list
    private ListView m_three_line_listview;
    private ListView m_five_line_listview;
    private ListView m_zhishu_listview;
    private ListView m_qushi_listview;

    private final static int tag_three_line_list=0;
    private final static int tag_five_line_list=1;
    private final static int tag_zhishu_list=2;
    private final static int tag_qushi_list=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_main);

        changeActivityMainBG();

        ListFrame =(FrameLayout)findViewById(R.id.ListFrame);
        m_three_line_listview= new ListView(this);
        m_three_line_listview.setItemsCanFocus(false);
        m_three_line_listview.setVerticalScrollBarEnabled(false);

        AdapterViewListener m_three_line_list_AdapterListener = new AdapterViewListener();
        m_three_line_listview.setOnItemClickListener(m_three_line_list_AdapterListener );

        m_three_line_listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getDemoListdata()));
        ListFrame.addView(m_three_line_listview,tag_three_line_list);

    }

    public void changeActivityMainBG(){
        ActivityMainBG =(RelativeLayout)findViewById(R.id.MainBg);
        ActivityMainBG.setBackground(this.getResources().getDrawable(R.drawable.weather_sunny));
    }

    private List<String> getDemoListdata(){
        List<String> data= new ArrayList<String>();

        data.add("test data 1");
        data.add("test data 2");
        data.add("test data 3 asdfasdfasdfasdfsdfasdf");

        return data;
    }

    class AdapterViewListener implements AdapterView.OnItemClickListener,
            AdapterView.OnItemLongClickListener {
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {

            return;
        }

        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
            return false;
        }
    }





















}
