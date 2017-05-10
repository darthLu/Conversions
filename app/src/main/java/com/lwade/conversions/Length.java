package com.lwade.conversions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Length extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);

        findViewById(R.id.fah_cel).setOnClickListener(onClick);
        findViewById(R.id.cel_kel).setOnClickListener(onClick);
        findViewById(R.id.inch_foot).setOnClickListener(onClick);
    }

    public View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fah_cel:
                    startActivity(new Intent(Length.this, Foot_Mile.class));
                    break;
                case R.id.cel_kel:
                    startActivity(new Intent(Length.this, Meter_Foot.class));
                    break;
                case R.id.inch_foot:
                    startActivity(new Intent(Length.this, Inch_Foot.class));
                    break;

            }
        }
    };
}