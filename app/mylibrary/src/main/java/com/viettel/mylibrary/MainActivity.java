package com.viettel.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MainActivity extends AppCompatActivity {
    public ExoPlayer player;
    public StyledPlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerView = findViewById(R.id.player_view);
        player = new ExoPlayer.Builder(this).build();
        MediaItem mediaItem = MediaItem.fromUri("https://cph-p2p-msl.akamaized.net/hls/live/2000341/test/master.m3u8");
        player.setMediaItem(mediaItem);

        player.prepare();
        player.play();
        playerView.setPlayer(player);
    }
}