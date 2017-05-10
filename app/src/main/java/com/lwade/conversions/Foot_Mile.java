package com.lwade.conversions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Foot_Mile extends Length {

   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.foot_mile);

       final EditText footText = (EditText) findViewById(R.id.footText);
       final TextView mileCalculated = (TextView) findViewById(R.id.mileCalculated);

       Button ftMileCalcButton = (Button) findViewById(R.id.ftMileCalcButton);
       ftMileCalcButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double feet = Double.parseDouble(footText.getText().toString());
               double calc = round(feet / 5280, 2);
               mileCalculated.setText(Double.toString(calc) + " Miles");
           }
       });

       Button clearButton = (Button) findViewById(R.id.clearButton);
       clearButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               if (v.getId() == R.id.footText) ;
               footText.setText("");
               if (v.getId() == R.id.mileCalculated) ;
               mileCalculated.setText("0");
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