package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView skillet = (TextView) findViewById(R.id.skillet_text_view);

        skillet.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent skilletIntent = new Intent(MainActivity.this, SkilletActivity.class);

                startActivity(skilletIntent);
            }
        });

        TextView welshlyArms = (TextView) findViewById(R.id.welshly_arms_text_view);

        welshlyArms.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent welshlyArmsIntent = new Intent(MainActivity.this, WelshlyArmsActivity.class);

                startActivity(welshlyArmsIntent);
            }
        });

        TextView ThreeDaysGrace = (TextView) findViewById(R.id.three_days_grace_text_view);
        ThreeDaysGrace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent threeDaysGraceIntent = new Intent(MainActivity.this, ThreeDaysGraceActivity.class);

                startActivity(threeDaysGraceIntent);
            }
        });
    }
}