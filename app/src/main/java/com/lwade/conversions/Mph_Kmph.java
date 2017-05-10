package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lindseywade on 4/18/17.
 */

public class Mph_Kmph extends Speed {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mph_kmph);

        final EditText mphText = (EditText) findViewById(R.id.mphtext);
        final TextView kmphCalculated = (TextView) findViewById(R.id.kmphCalculated);

        final Button mphKmphCalcButton = (Button) findViewById(R.id.mphKmphCalcButton);
        mphKmphCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mph = Double.parseDouble(mphText.getText().toString());
                double calc = round(mph * 1.60934, 2);
                kmphCalculated.setText(Double.toString(calc) + " kmph");
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.mphtext) ;
                mphText.setText("");
                if (v.getId() == R.id.mphKmphCalcButton) ;
                mphKmphCalcButton.setText("0");
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
