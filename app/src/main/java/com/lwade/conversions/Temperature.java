package com.lwade.conversions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by lindseywade on 4/17/17.
 */

public class Temperature extends MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);

        findViewById(R.id.fah_cel).setOnClickListener(onClick);
        findViewById(R.id.cel_kel).setOnClickListener(onClick);
        findViewById(R.id.fah_kel).setOnClickListener(onClick);
    }

    public View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fah_cel:
                    startActivity(new Intent(Temperature.this, Fah_Cel.class));
                    break;
                case R.id.cel_kel:
                    startActivity(new Intent(Temperature.this, Cel_Kel.class));
                    break;
                case R.id.fah_kel:
                    startActivity(new Intent(Temperature.this, Fah_Kel.class));
                    break;
            }
        }
    };
}
