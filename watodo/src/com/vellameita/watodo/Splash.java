package com.vellameita.watodo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer splashSong;
	protected void onCreate(Bundle watodoWhenYouLoveBacon) {
		super.onCreate(watodoWhenYouLoveBacon);
		setContentView(R.layout.splash);
		splashSong = MediaPlayer.create(Splash.this,R.raw.pokeballin);
		splashSong.start();
		Thread timer  = new Thread(){
			public void run(){
				try{
					sleep(2000);
				} catch(InterruptedException e){
					e.printStackTrace();
				} finally{
					Intent openStartingPoint = new Intent("com.vellameita.watodo.STARTINGPOINT");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}
	protected void onPause() {	
		super.onPause();
		splashSong.release();
		finish();
	}

}
