package com.example.music_layout;

public class Music {

    /** Artist Name */
    private String mArtist_name;

    /** Song Title */
    private String mSong_title;


    public Music(String artist_name, String song_title) {
        mArtist_name = artist_name;
        mSong_title = song_title;
    }


    public String getArtist() {
        return mArtist_name;
    }


    public String getSong() {
        return mSong_title;
    }
}
