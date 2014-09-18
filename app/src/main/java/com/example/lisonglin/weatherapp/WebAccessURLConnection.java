package com.example.lisonglin.weatherapp;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lisonglin on 14-9-18.
 */
public class WebAccessURLConnection {
    public WebAccessURLConnection(){}

    public String GetWebContent(String urlPath){
        URL url;

        HttpGet request = new HttpGet(urlPath);

        try {

            url = new URL(urlPath);

            try {

                HttpURLConnection Connection = (HttpURLConnection)url.openConnection();
                Connection.setConnectTimeout(6*1000);

                if(HttpStatus.SC_OK==Connection.getResponseCode()){
                    try {
                        int i;
                        String result = "";
                        InputStreamReader isr = new InputStreamReader(
                                Connection.getInputStream(), "utf-8");
                        while ((i = isr.read()) != -1) {
                            result = result + (char) i;
                        }
                        return result;
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        Connection.disconnect();
                    }

                }


            }catch (IOException e){
                e.printStackTrace();
            }


        }catch (MalformedURLException e){
            e.printStackTrace();
        }



        return  null;
    }




}
