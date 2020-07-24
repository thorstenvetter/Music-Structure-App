package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SkilletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Monster","2:58 min"));
        songs.add(new Song("Feel Invincible","3:49 min"));
        songs.add(new Song("Hero","3:06 min"));
        songs.add(new Song("The Resistance","3:52 min"));
        songs.add(new Song("Awake and Alive","3:29 min"));
        songs.add(new Song("Legendary","4:04 min"));
        songs.add(new Song("Comatose","3:50 min"));
        songs.add(new Song("Not Gonna Die","3:45 min"));

        ArrayAdapter<Song> adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
