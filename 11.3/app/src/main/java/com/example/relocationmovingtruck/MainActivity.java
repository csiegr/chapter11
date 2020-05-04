package com.example.relocationmovingtruck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int intTruck;
    int intNumOfMiles;
    int intTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Truck = (EditText) findViewById(R.id.txtTruck);
        final EditText NumOfMiles = (EditText) findViewById(R.id.txtNumOfMiles);
        final EditText Total = (EditText) findViewById(R.id.txtTotal);
        Button button = (Button) findViewById(R.id.btnTotal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intTruck = Integer.parseInt(Truck.getText().toString());
                intNumOfMiles = Integer.parseInt(NumOfMiles.getText().toString());
              //  intTotal = Integer.parseInt(Total.getText().toString());
                //SharedPreferences sharedPref = null;
                SharedPreferences sharedPref = null;
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("key1", intTruck);
                editor.putInt("key2", intNumOfMiles);
             //   editor.putInt("key3", intTotal);

                editor.commit();
                startActivity(new Intent(MainActivity.this, Final.class));
            }
            });
    }
}
