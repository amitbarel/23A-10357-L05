package com.amitb.a23a_10357_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amitb.a23a_10357_l05.Model.Playlist;
import com.amitb.a23a_10357_l05.Model.Song;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Playlist playlist = new Playlist();
        playlist.setName("My favorite songs");
        playlist.getSongs().add(new Song().
                setName("פנתרה").
                setArtist("נועה קירל").
                setDuration(205).
                setReleaseDate(System.currentTimeMillis()/1000).
                setRating(4.3f).
                setViews(18001491).
                addTag("Pop").
                addTag("Israeli")
        );

        playlist.getSongs().add(new Song().
                setName("Gangnam style").
                setArtist("PSY").
                setDuration(252).
                setReleaseDate(System.currentTimeMillis()/1000).
                setRating(4.9f).
                setViews(4_600_000_000l).
                addTag("K-Pop").
                addTag("Korean")
        );
    }
}