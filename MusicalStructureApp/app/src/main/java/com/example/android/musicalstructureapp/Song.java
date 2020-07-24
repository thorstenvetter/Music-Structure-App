package com.example.android.musicalstructureapp;

public class Song {

    private String mSongName;
    private String mSongLength;

    public Song (String songName, String songLength){
        mSongName = songName;
        mSongLength = songLength;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getSongLength() {
        return mSongLength;
    }
}
