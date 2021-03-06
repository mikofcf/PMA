package com.mbm.ftn.mbm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.mbm.ftn.mbm.activities.Compass;
import com.mbm.ftn.mbm.activities.Flashlight2Activity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton flashlightButton2 = (ImageButton) findViewById(R.id.button_topleft);
        flashlightButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Flashlight2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton flashlightButton3 = (ImageButton) findViewById(R.id.button_topright);
        flashlightButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Compass.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
