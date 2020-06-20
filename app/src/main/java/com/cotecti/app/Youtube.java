package com.cotecti.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaActionSound;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;



public class Youtube extends AppCompatActivity {
    private MediaController mediaController;
    @Override
    protected void onStart() {
        super.onStart();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        getSupportActionBar().hide();
        VideoView videoView = findViewById(R.id.elisemp4);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.eliseenergy;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}
//        configureVideoView();
//    }
//    private void configureVideoView() {
//        final VideoView videoView =findViewById(R.id.elisemp4);
//        videoView.setVideoPath(
//                "https://www.ebookfrenzy.com/android_book/movie.mp4");
//        mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        videoView.start();
//    }
//}