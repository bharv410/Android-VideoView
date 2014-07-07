package com.example.videoprac;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){


		super.onCreate(savedInstanceState);
	    try {
	        setContentView(R.layout.activity_main);
	        String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
	        VideoView videoView = (VideoView) findViewById(R.id.VideoView);
	        MediaController mediaController = new MediaController(this);
	        mediaController.setAnchorView(videoView);
	        Uri video = Uri.parse(vidAddress);
	        videoView.setMediaController(mediaController);
	        videoView.setVideoURI(video);
	        videoView.start();
	    } catch (Exception e) {
	        // TODO: handle exception
	        Toast.makeText(this, "Error connecting", Toast.LENGTH_SHORT).show();
	    }
	}
}