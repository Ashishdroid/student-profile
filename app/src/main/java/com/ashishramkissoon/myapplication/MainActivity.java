package com.ashishramkissoon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinnerMain1 = (Spinner) findViewById(R.id.spinnerMain1);
        Spinner mySpinnerMain2 = (Spinner) findViewById(R.id.spinnerMain2);
        Spinner mySpinnerMain3 = (Spinner) findViewById(R.id.spinnerMain3);

        Spinner mySpinnerSub1 = (Spinner) findViewById(R.id.spinnerSub1);
        Spinner mySpinnerSub2 = (Spinner) findViewById(R.id.spinnerSub2);

        Spinner mySpinnerPassion = (Spinner) findViewById(R.id.spinnerPassion);




        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));

        ArrayAdapter<String> myAdapterPassion = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.passion));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinnerMain1.setAdapter(myAdapter);
        mySpinnerMain2.setAdapter(myAdapter);
        mySpinnerMain3.setAdapter(myAdapter);

        mySpinnerSub1.setAdapter(myAdapter);
        mySpinnerSub2.setAdapter(myAdapter);

        mySpinnerPassion.setAdapter(myAdapterPassion);

        Utils.darkenStatusBar(this, R.color.blue);





    }
}
