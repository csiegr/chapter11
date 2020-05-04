package com.example.relocationmovingtruck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class Final extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        TextView intTotal = (TextView)findViewById(R.id.txtTotal);
        ImageView image = (ImageView)findViewById(R.id.truckImg);

        SharedPreferences sharedPref = (SharedPreferences) getDefaultSharedPreferences(this);
        int intTruck = sharedPref.getInt("key1",0);
        int intNumOfMiles = sharedPref.getInt("key2", 0);
        float decTotal;

        decTotal = (intTruck * intNumOfMiles);
        DecimalFormat currency = new DecimalFormat("$###,###.###");

        if(intTruck == 10) {
            intTruck = (int) 19.95;
            image.setImageResource(R.drawable.ten);
        }

        if(intTruck == 17) {
            intTruck = (int) 29.95;
            image.setImageResource(R.drawable.seventeen);
        }

            else if (intTruck == 26) {
                intTruck = (int) 39.95;
                image.setImageResource(R.drawable.twentysix);
            }
            else{
                intTotal.setText("Enter 10, 17, or 26");
            }
        }

    }



