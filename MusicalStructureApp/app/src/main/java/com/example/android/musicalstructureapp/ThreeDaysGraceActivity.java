package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ThreeDaysGraceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("I Hate Everything About You","3:51 min"));
        songs.add(new Song("Animal I Have Become","3:51 min"));
        songs.add(new Song("Riot","3:27 min"));
        songs.add(new Song("Never Too Late","3:29 min"));
        songs.add(new Song("Pain","3:22 min"));
        songs.add(new Song("I Am Machine","3:20 min"));
        songs.add(new Song("Painkiller","2:59 min"));
        songs.add(new Song("Time Of Dying","3:06 min"));
        songs.add(new Song("Break","3:13 min"));
        songs.add(new Song("The Mountain","3:18 min"));

        ArrayAdapter<Song> adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
