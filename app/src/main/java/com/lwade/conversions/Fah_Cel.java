package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fah_Cel extends Temperature {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fah_cel);

        final EditText fahText = (EditText) findViewById(R.id.fahText);
        final TextView celsiusCalculated = (TextView) findViewById(R.id.celsiusCalculated);

        final Button fahCelCalcButton = (Button) findViewById(R.id.fahCelCalcButton);
        fahCelCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fah = Double.parseDouble(fahText.getText().toString());
                double calc = round((fah - 32) * 5 / 9, 2);
                celsiusCalculated.setText(Double.toString(calc) + (char)0x00B0 + " Celsius");
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.fahText) ;
                fahText.setText("");
                if (v.getId() == R.id.celsiusCalculated) ;
                celsiusCalculated.setText("0");
            }
        });

    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}