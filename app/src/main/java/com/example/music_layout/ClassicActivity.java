package com.example.music_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    final private int artist_count = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_music);

        ArrayList<Music> musics = new ArrayList<>();
        int i = 0;
        while(i < artist_count)
        {
            musics.add(new Music("ClassicArtist" + i, "SongTitle" + i));
            i++;
        }



        MusicAdapter adapter = new MusicAdapter(this, musics);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        Button library = (Button) findViewById(R.id.libarary_list);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(ClassicActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });


    }


    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        Music current = (Music) adapterView.getItemAtPosition(position);

        String artist = current.getArtist();
        String song = current.getSong();

        // Artist and Song get passed to Playmusic activity
        Intent musicIntent = new Intent(this, PlayMusic.class);
        musicIntent.putExtra("artist", artist);
        musicIntent.putExtra("song", song);
        startActivity(musicIntent);
    }
}
