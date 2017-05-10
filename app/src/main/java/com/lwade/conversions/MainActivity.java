package com.lwade.conversions;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineButtons();
    }


        public void defineButtons() {
            findViewById(R.id.lengthButton).setOnClickListener(onClick);
            findViewById(R.id.tempButton).setOnClickListener(onClick);
            findViewById(R.id.speedButton).setOnClickListener(onClick);
    }

        public View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.lengthButton:
                        startActivity(new Intent(MainActivity.this, Length.class));
                        break;
                    case R.id.tempButton:
                        startActivity(new Intent(MainActivity.this, Temperature.class));
                        break;
                    case R.id.speedButton:
                        startActivity(new Intent(MainActivity.this, Speed.class));
                        break;
                }
            }
        };

    }
