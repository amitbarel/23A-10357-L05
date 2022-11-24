package com.amitb.a23a_10357_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.amitb.a23a_10357_l05.Model.Playlist;
import com.amitb.a23a_10357_l05.Model.Song;
import com.amitb.a23a_10357_l05.Utils.MySPv1;
import com.amitb.a23a_10357_l05.Utils.MySPv2;
import com.amitb.a23a_10357_l05.Utils.MySPv3;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String SP_KEY_NAME = "SP_KEY_NAME";
    private static final String SP_KEY_SCORE = "SP_KEY_SCORE";
    private static final String SP_KEY_PLAYLIST = "SP_KEY_PLAYLIST";

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

        String playlistJson = new Gson().toJson(playlist);
        Log.d("JSON",playlistJson);

//        String json2 = "{\"name\":\"My favorite songs\",\"songs\":[{\"artist\":\"נועה קירל\",\"duration\":205,\"name\":\"פנתרה\",\"rating\":4.3,\"releaseDate\":1669208715,\"tags\":[\"Pop\",\"Israeli\"],\"views\":18001491},{\"artist\":\"PSY\",\"duration\":252,\"name\":\"Gangnam style\",\"rating\":4.9,\"releaseDate\":1669208715,\"tags\":[\"K-Pop\",\"Korean\"],\"views\":4600000000}]}";
//        Playlist playlist2 = new Gson().fromJson(json2,Playlist.class);
//        Log.d("Playlist from JSON", playlist2.toString());

////        MySPv1.putInt(this,SP_KEY_SCORE,134);
//        int score = MySPv1.getInt(this,SP_KEY_SCORE,0);

//        MySPv2 mySPv2 = new MySPv2(this);
//        mySPv2.putString(SP_KEY_NAME,"23A-10357-L05");
//        String className = mySPv2.getString(SP_KEY_NAME,"");
//        Log.d("NAME:",className);

        MySPv3.getInstance().putString(SP_KEY_PLAYLIST,playlistJson);
        String playlistAsJsonStringFromSP = MySPv3.getInstance().getString(SP_KEY_PLAYLIST,"");
        Playlist playlistFromJson = new Gson().fromJson(playlistAsJsonStringFromSP,Playlist.class);
        Log.d("playlistFromSP", playlistFromJson.toString());
    }
}