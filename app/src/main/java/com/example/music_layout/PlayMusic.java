package com.example.music_layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class PlayMusic extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        final Button buttonClick = (Button) findViewById(R.id.play);
        final SeekBar seek = (SeekBar) findViewById(R.id.seek);

        Intent musicIntent = getIntent();
        // Set artist title;
        TextView artist = findViewById(R.id.artist_playing);
        artist.setText(musicIntent.getStringExtra("artist"));

        // Set the title of activity to Artist name
        setTitle(musicIntent.getStringExtra("artist"));

        // Set the music title.
        TextView song = findViewById(R.id.song_playing);
        song.setText(musicIntent.getStringExtra("song"));



        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick.getText().equals("Play")) {
                    buttonClick.setText("Pause");
                }
                else{
                    buttonClick.setText("Play");
                }
            }
        });

        Button library = (Button) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(PlayMusic.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

    }
}
