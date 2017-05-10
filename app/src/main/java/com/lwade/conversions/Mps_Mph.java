package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lindseywade on 4/18/17.
 */

public class Mps_Mph extends Speed {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mps_mph);

        final EditText mpsText = (EditText) findViewById(R.id.mpsText);
        final TextView mphCalculated = (TextView) findViewById(R.id.mphCalculated);

        final Button mpsMphCalcButton = (Button) findViewById(R.id.mpsMphCalcButton);
        mpsMphCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mps = Double.parseDouble(mpsText.getText().toString());
                double calc = round(mps * 2.23694, 2);
                mphCalculated.setText(Double.toString(calc) + " mph");
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.mpsText) ;
                mpsText.setText("");
                if (v.getId() == R.id.mphCalculated) ;
                mphCalculated.setText("0");
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
