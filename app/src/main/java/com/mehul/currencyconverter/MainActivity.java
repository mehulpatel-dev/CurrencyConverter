package com.mehul.currencyconverter;

/*
    Name: CAD to USD Convert App
    Description: A simple app that prompts user to enter a CAD dollar amount and convertion outputs
    as toast to the USD.
    Author: Mehul Patel
    Date: 12/9/2019

 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    //method for when Convert button is clicked
    public void convertFunction (View view){

        //declaring variable to hold the value entered from the amountText number field
        EditText amount = (EditText) findViewById(R.id.amountText);

        //creating variable to hold the amount entered converted to string
        Double dollarAmount = Double.parseDouble(amount.getText().toString());

        //variable to hold the converted amount to USD
        Double usAmount = dollarAmount * 0.76;

        //displays the converted US amount to two decimal places as string
        Toast.makeText(MainActivity.this, "$" + String.format("%.2f", usAmount), Toast.LENGTH_SHORT).show();

        //captures log of the output/converted amount - used to test
        Log.i("Info", usAmount.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
