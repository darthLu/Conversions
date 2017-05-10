package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.lwade.conversions.R.id.knotText;

/**
 * Created by lindseywade on 4/18/17.
 */

public class Knot_Mph extends Speed {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knot_mph);

        final EditText knotText = (EditText) findViewById(R.id.knotText);
        final TextView mphCalculated = (TextView) findViewById(R.id.mphCalculated);

        final Button knotMphCalcButton = (Button) findViewById(R.id.knotMphCalcButton);
        knotMphCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double knot = Double.parseDouble(knotText.getText().toString());
                double calc = round(knot * 1.15078, 2);
                mphCalculated.setText(Double.toString(calc) + " mph");
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.knotText);
                knotText.setText("");
                if (v.getId() == R.id.mphCalculated);
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
