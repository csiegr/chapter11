package com.example.homemortgageinterestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    int intYears;
    int intMonthlyPayment;
    int intPrincipal;
    int intInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText month = (EditText) findViewById(R.id.txtMonthlyPayment);
        final EditText years = (EditText) findViewById(R.id.txtYears);
        final EditText principal = (EditText) findViewById(R.id.txtPrincipal);
        final EditText interest = (EditText) findViewById(R.id.txtInterest);
        Button button = (Button) findViewById(R.id.compBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intYears = Integer.parseInt(years.getText().toString());
                intMonthlyPayment = Integer.parseInt(month.getText().toString());
                intPrincipal = Integer.parseInt(principal.getText().toString());
                intInterest = Integer.parseInt(interest.getText().toString());
                SharedPreferences sharedPref = null;
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("key1", intYears);
                editor.putInt("key2", intMonthlyPayment);
                editor.putInt("key3", intPrincipal);
                editor.putInt("key4", intInterest);

                editor.commit();
                startActivity(new Intent(MainActivity.this, total.class));


            }
        });
    }
}
