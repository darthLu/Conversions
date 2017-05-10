package com.lwade.conversions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by lindseywade on 4/17/17.
 */

public class Speed extends MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);

        findViewById(R.id.mph_kmph).setOnClickListener(onClick);
        findViewById(R.id.mps_mph).setOnClickListener(onClick);
        findViewById(R.id.knot_mph).setOnClickListener(onClick);
    }

    public View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.mph_kmph:
                    startActivity(new Intent(Speed.this, Mph_Kmph.class));
                    break;
                case R.id.mps_mph:
                    startActivity(new Intent(Speed.this, Mps_Mph.class));
                    break;
                case R.id.knot_mph:
                    startActivity(new Intent(Speed.this, Knot_Mph.class));
                    break;
            }
        }
    };
}
