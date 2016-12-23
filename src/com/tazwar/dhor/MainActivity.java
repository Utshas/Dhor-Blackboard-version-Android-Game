package com.tazwar.dhor;

import java.util.Random;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	ImageView survival,time_limit,high_score,achievements,sound,developer;
	int i=0;
	private static int j;
	TextView tips;
	MediaPlayer mp,mp_click;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		survival=(ImageView)findViewById(R.id.survival);
		time_limit=(ImageView)findViewById(R.id.time_limits);
		achievements=(ImageView)findViewById(R.id.achievements);
		high_score=(ImageView)findViewById(R.id.high_score);
		sound=(ImageView)findViewById(R.id.sound);
		developer=(ImageView)findViewById(R.id.developer);
		survival.setOnClickListener(this);
		time_limit.setOnClickListener(this);
		achievements.setOnClickListener(this);
		high_score.setOnClickListener(this);
		sound.setOnClickListener(this);
		developer.setOnClickListener(this);
		tips=(TextView)findViewById(R.id.tips);
		Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
		tips.setTypeface(tf);
		tips.setOnClickListener(this);
		setTips();
		
		
	}

	private void setTips() {
		// TODO Auto-generated method stub
		
			Random ran=new Random();
			int k=ran.nextInt(4);
			if(k==j)
				setTips();
			else{
			switch (j) {
			case 0:
				tips.setText("In Time limit mode you can hit the thief as much as you want.");
				break;
			case 1:
				tips.setText("In case of Survival mode if you hit the police man, the game is over.");
				break;
			case 2:
				tips.setText("In case of Time Limit mode, if you hit the police man, you will get 1 point minus.");
				break;
			case 3:
				tips.setText("Hitting DOUBLE THIEVES will give you plus 5 points.");
				break;
				}
			j=k;
			}
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mp_click=MediaPlayer.create(this, R.raw.click);
		mp_click.setLooping(false);
		mp_click.start();
		if(v.getId()==R.id.survival)
		{
			Intent in=new Intent(MainActivity.this,Survival.class);
			startActivity(in);
			overridePendingTransition(R.anim.slide_left_in,0);
			mp.stop();
		}
		else if(v.getId()==R.id.time_limits)
		{
			Intent in=new Intent(MainActivity.this,TimeLimit.class);
			startActivity(in);
			overridePendingTransition(R.anim.slide_left_in,0);
			mp.stop();
		}
		else if(v.getId()==R.id.achievements)
		{
			Intent in=new Intent(MainActivity.this,Achievements.class);
			startActivity(in);
			overridePendingTransition(R.anim.slide_left_in,0);
			mp.stop();
		}
		else if(v.getId()==R.id.high_score)
		{
			SharedPreferences sp,sph;
			sp=getApplicationContext().getSharedPreferences("Mypref", 0);
			sph=getApplicationContext().getSharedPreferences("Myprefh", 0);
			int az=sp.getInt("Mypref",0);
			int za=sph.getInt("Myprefh",0);
			LayoutInflater li=LayoutInflater.from(MainActivity.this);
			View view=li.inflate(R.layout.custom_dialog, null);
			Button ok=(Button)view.findViewById(R.id.ok);
			TextView dtext=(TextView)view.findViewById(R.id.dtext);
			TextView dtitel=(TextView)view.findViewById(R.id.titel);
			Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
			dtext.setTypeface(tf);
			dtitel.setTypeface(tf);
			AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
			builder.setView(view);
			builder.setCancelable(false);
			final AlertDialog simpleDialog=builder.create();
			dtitel.setText("High Score");
			dtext.setText("Highest Score(Time Limit Mode) : "+az+"\n"+"Highest Score(Survival Mode) : "+za);
			ok.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					simpleDialog.cancel();
				}
				
			});
			
			simpleDialog.show();
		}
		else if(v.getId()==R.id.sound)
		{
			if(i%2==0){mute();}
			else{unmute();}
				i++;
		}
		else if(v.getId()==R.id.developer)
		{
			LayoutInflater li=LayoutInflater.from(MainActivity.this);
			View view=li.inflate(R.layout.custom_dialog, null);
			Button ok=(Button)view.findViewById(R.id.ok);
			TextView dtext=(TextView)view.findViewById(R.id.dtext);
			TextView dtitel=(TextView)view.findViewById(R.id.titel);
			Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
			dtext.setTypeface(tf);
			dtitel.setTypeface(tf);
			AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
			builder.setView(view);
			builder.setCancelable(false);
			final AlertDialog simpleDialog=builder.create();
			dtitel.setText("Developer");
			dtext.setText("Ahmed Mahir Tazwar \n CSE, CUET \n Email: tazwarutshas@gmail.com \n Website: blogtazwar.wordpress.com");
			ok.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					simpleDialog.cancel();
				}
				
			});
			
			simpleDialog.show();
		}
		else if(v.getId()==R.id.tips)
		{
			setTips();
		}
		
	}
	public void mute() {
		AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        amanager.setStreamMute(AudioManager.STREAM_NOTIFICATION, true);
        amanager.setStreamMute(AudioManager.STREAM_ALARM, true);
        amanager.setStreamMute(AudioManager.STREAM_MUSIC, true);
        amanager.setStreamMute(AudioManager.STREAM_RING, true);
        amanager.setStreamMute(AudioManager.STREAM_SYSTEM, true);
        sound.setImageResource(R.drawable.mute);
		
	}
	public void unmute() {

    	AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
			amanager.setStreamMute(AudioManager.STREAM_NOTIFICATION, false);
             amanager.setStreamMute(AudioManager.STREAM_ALARM, false);
             amanager.setStreamMute(AudioManager.STREAM_MUSIC, false);
             amanager.setStreamMute(AudioManager.STREAM_RING, false);
             amanager.setStreamMute(AudioManager.STREAM_SYSTEM, false);
             sound.setImageResource(R.drawable.sound);
			
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mp=MediaPlayer.create(this, R.raw.starting);
		mp.setLooping(true);
		mp.start();
	}

}
