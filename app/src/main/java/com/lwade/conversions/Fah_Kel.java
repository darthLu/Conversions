package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lindseywade on 4/18/17.
 */

public class Fah_Kel extends Temperature {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fah_kel);

        final EditText fahText = (EditText) findViewById(R.id.fahText);
        final TextView kelvinCalculated = (TextView) findViewById(R.id.kelvinCalculated);

        final Button fahKelCalcButton = (Button) findViewById(R.id.fahKelCalcButton);
        fahKelCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fah = Double.parseDouble(fahText.getText().toString());
                double calc = round((fah + 459.67) * 5 / 9, 2);
                kelvinCalculated.setText(Double.toString(calc) + " Kelvin");
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.fahText) ;
                fahText.setText("");
                if (v.getId() == R.id.kelvinCalculated) ;
                kelvinCalculated.setText("0");
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