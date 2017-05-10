package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Meter_Foot extends Length {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meter_foot);

        final EditText meterText = (EditText) findViewById(R.id.meterText);
        final TextView ftCalculated = (TextView) findViewById(R.id.ftCalculated);

        Button ftMeterCalcButton = (Button) findViewById(R.id.inchFtCalcButton);
        ftMeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double meters = Double.parseDouble(meterText.getText().toString());
                double calc = round(meters * 3.28, 2);
                ftCalculated.setText(Double.toString(calc) + " Feet");
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.meterText) ;
                meterText.setText("");
                if (v.getId() == R.id.ftCalculated) ;
                ftCalculated.setText("0");
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