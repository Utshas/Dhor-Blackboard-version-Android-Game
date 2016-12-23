package com.tazwar.dhor;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;
 
public class Splash_screen extends Activity {
 MediaPlayer mp;
 TextView splaTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);
        
		splaTextView=(TextView)findViewById(R.id.splash_text);
		Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
		splaTextView.setTypeface(tf);
		mp=MediaPlayer.create(this, R.raw.police);
		mp.setLooping(false);
		mp.start();
        new Handler().postDelayed(new Runnable() {
 
            @Override
            public void run() {
                Intent i = new Intent(Splash_screen.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_left_in,0);
                // close this activity
            }
        }, 1100);
    }
 
}