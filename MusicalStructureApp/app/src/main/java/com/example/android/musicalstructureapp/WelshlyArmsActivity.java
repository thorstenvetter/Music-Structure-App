package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class WelshlyArmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Legendary","3:52 min"));
        songs.add(new Song("Sanctuary","3:47 min"));
        songs.add(new Song("Indestructible","3:46 min"));
        songs.add(new Song("Learn to Let Go","3:34 min"));
        songs.add(new Song("Trouble","3:05 min"));
        songs.add(new Song("Stand","3:16 min"));
        songs.add(new Song("Never Meant To Be","2:55 min"));
        songs.add(new Song("Bad Blood","3:33 min"));
        songs.add(new Song("Need You Tonight","4:34 min"));
        songs.add(new Song("Who We Are","3:47 min"));

        ArrayAdapter<Song> adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
