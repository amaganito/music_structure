package com.example.music_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView rap = (TextView) findViewById(R.id.rap);
        TextView rock = (TextView) findViewById(R.id.rock);
        TextView randb = (TextView) findViewById(R.id.randb);
        TextView classic = (TextView) findViewById(R.id.classic);

        //setOnClickListners
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rapIntent = new Intent(MainActivity.this, RapActivity.class);
                startActivity(rapIntent);
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        randb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randbIntent = new Intent(MainActivity.this, RandBActvity.class);
                startActivity(randbIntent);
            }
        });

        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, ClassicActivity.class);
                startActivity(familyIntent);
            }
        });
    }


}

