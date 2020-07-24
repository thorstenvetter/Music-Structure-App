package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs){

        super(context,0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent,false);
        }

        Song currentSong = (Song) getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);

        songNameTextView.setText(currentSong.getSongName());

        TextView songLengthTextView = (TextView) listItemView.findViewById(R.id.song_length_text_view);
        songLengthTextView.setText(currentSong.getSongLength());

        return listItemView;
    }
}
