package com.example.music_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Context context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View musicList = convertView;
        if (musicList == null) {
            musicList = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list, parent, false);
        }

        Music current = getItem(position);

        TextView artist_name = (TextView) musicList.findViewById(R.id.artist_name);

        artist_name.setText(current.getArtist());

        TextView song_title = (TextView) musicList.findViewById(R.id.song_title);

        song_title.setText(current.getSong());


        return musicList;
    }
}
