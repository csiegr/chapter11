package com.example.homemortgageinterestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class total extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        TextView intInterest = (TextView)findViewById(R.id.txtInterest);
        ImageView image = (ImageView)findViewById(R.id.imgYears);
        SharedPreferences sharedPref = getDefaultSharedPreferences(this);
        int intYears = sharedPref.getInt("key1",0);
        int intMonthlyPayment = sharedPref.getInt("key2",0);
        int intPrincipal = sharedPref.getInt("key3",0);
      //  int intInterest = sharedPref.getInt("key4",0);
        float decTotalInterest;

        decTotalInterest = (intMonthlyPayment + (12 * intYears) - intPrincipal);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        intInterest.setText("Total Interest paid " + currency.format(decTotalInterest));

        if(intYears == 10) {
            image.setImageResource(R.drawable.ten);
        }

        if(intYears == 20) {
            image.setImageResource(R.drawable.twenty);
        }

        else if(intYears == 30) {
            image.setImageResource(R.drawable.thirty);
        }

        else{
            intInterest.setText("Enter 10, 20, or 30 years");
        }








    }
}
