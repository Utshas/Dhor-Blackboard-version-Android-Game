package com.tazwar.dhor;

import java.util.Random;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Survival extends Activity implements OnClickListener{
TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
int chapse=0,total=0,y=-1,i=0,change=0;
Button b;
CountDownTimer cdt;
MediaPlayer mp_click,mp_chor,mp_police,mp_over;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survival);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		t4=(TextView)findViewById(R.id.textView4);
		t5=(TextView)findViewById(R.id.textView5);
		t6=(TextView)findViewById(R.id.textView6);
		t7=(TextView)findViewById(R.id.textView7);
		t8=(TextView)findViewById(R.id.textView8);
		t9=(TextView)findViewById(R.id.textView9);
		t10=(TextView)findViewById(R.id.textView10);
		t11=(TextView)findViewById(R.id.textView11);
		t12=(TextView)findViewById(R.id.textView12);
		t13=(TextView)findViewById(R.id.textView13);
		t14=(TextView)findViewById(R.id.textView14);
		t15=(TextView)findViewById(R.id.textView15);
		t17=(TextView)findViewById(R.id.textView17);
		t16=(TextView)findViewById(R.id.textView16);
		fakaKor();
		startIt();
		t17.setText("WAIT...");
		Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
		t17.setTypeface(tf);
		mp_chor=MediaPlayer.create(this, R.raw.chok);
		mp_chor.setLooping(false);
		mp_police=MediaPlayer.create(this, R.raw.police);
		mp_police.setLooping(false);
		mp_click=MediaPlayer.create(this, R.raw.click);
		mp_click.setLooping(false);
		mp_over=MediaPlayer.create(this, R.raw.game_over);
		mp_over.setLooping(false);
	}
	

	private void startIt() {
		// TODO Auto-generated method stub
		Handler h= new Handler();
		h.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				
				changeText();
				
			}
		}, 1009);}

	public void changeText()
	{
		cdt=new CountDownTimer(99990, 640) {

		     public void onTick(long millisUntilFinished) {
		         //mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
		    	 if(change!=1)y++;
		    	 if(y>chapse && i==0)
		    	 { 
		    		 scoreLekh();
		    		 i=1;
		    	 }
		    	 else if(y>chapse && i==1)
		    	 {}
		    	 else
		    		 {fakaKor();
		    		 lekhaVor();
		    		 chapse=y;}
		    		 }

		     public void onFinish() {
		         //mTextField.setText("done!");
		     }
		  };
		  cdt.start();	
	}

	public void fakaKor()
	{
		t1.setBackgroundResource(R.drawable.winclose);
		t2.setBackgroundResource(R.drawable.winclose);
		t3.setBackgroundResource(R.drawable.winclose);
		t4.setBackgroundResource(R.drawable.winclose);
		t5.setBackgroundResource(R.drawable.winclose);
		t6.setBackgroundResource(R.drawable.winclose);
		t7.setBackgroundResource(R.drawable.winclose);
		t8.setBackgroundResource(R.drawable.winclose);
		t9.setBackgroundResource(R.drawable.winclose);
		t10.setBackgroundResource(R.drawable.winclose);
		t11.setBackgroundResource(R.drawable.winclose);
		t12.setBackgroundResource(R.drawable.winclose);
		t13.setBackgroundResource(R.drawable.winclose);
		t14.setBackgroundResource(R.drawable.winclose);
		t15.setBackgroundResource(R.drawable.winclose);
		t16.setBackgroundResource(R.drawable.winclose);
		t1.setEnabled(false);
		t2.setEnabled(false);
		t3.setEnabled(false);
		t4.setEnabled(false);
		t5.setEnabled(false);
		t6.setEnabled(false);
		t7.setEnabled(false);
		t8.setEnabled(false);
		t9.setEnabled(false);
		t10.setEnabled(false);
		t11.setEnabled(false);
		t12.setEnabled(false);
		t13.setEnabled(false);
		t14.setEnabled(false);
		t15.setEnabled(false);
		t16.setEnabled(false);
	}
	public void lekhaVor()
	{
		Random ran=new Random();
		change=ran.nextInt(4);
		switch (change) {
		case 0:
			dakatVor();
			break;
		case 1:
			policeVor();
			break;
		case 2:
			
			dakatVor();
			break;
		case 3:
			dakatVor();
			break;
		case 4:
			dakatVor();
			break;	}
	}
	public void policeVor()
   {
		mp_police.start();
	Random ran=new Random();
	switch (ran.nextInt(14)) {
	case 0:
		//t1.setText("Dhor");
		t1.setBackgroundResource(R.drawable.police);
		t1.setEnabled(true);
		t1.setOnClickListener(this);
		break;
	case 1:
		t2.setBackgroundResource(R.drawable.police);
		t2.setEnabled(true);
		t2.setOnClickListener(this);
		break;
	case 2:
		t3.setBackgroundResource(R.drawable.police);
		t3.setEnabled(true);
		t3.setOnClickListener(this);
		break;
	case 3:
		t4.setBackgroundResource(R.drawable.police);
		t4.setEnabled(true);
		t4.setOnClickListener(this);
		break;
	case 4:
		t5.setBackgroundResource(R.drawable.police);
		t5.setEnabled(true);
		t5.setOnClickListener(this);
		break;
	case 5:
		t6.setBackgroundResource(R.drawable.police);
		t6.setEnabled(true);
		t6.setOnClickListener(this);
		break;
	case 6:
		t7.setBackgroundResource(R.drawable.police);
		t7.setEnabled(true);
		t7.setOnClickListener(this);
		break;
	case 7:
		t8.setBackgroundResource(R.drawable.police);
		t8.setEnabled(true);
		t8.setOnClickListener(this);
		break;
	case 8:
		t9.setBackgroundResource(R.drawable.police);
		t9.setEnabled(true);
		t9.setOnClickListener(this);
		break;
	case 9:
		t10.setBackgroundResource(R.drawable.police);
		t10.setEnabled(true);
		t10.setOnClickListener(this);
		break;
	case 10:
		t11.setBackgroundResource(R.drawable.police);
		t11.setEnabled(true);
		t11.setOnClickListener(this);
		break;
	case 11:
		t12.setBackgroundResource(R.drawable.police);
		t12.setEnabled(true);
		t12.setOnClickListener(this);
		break;
	case 12:
		t13.setBackgroundResource(R.drawable.police);
		t13.setEnabled(true);
		t13.setOnClickListener(this);
		break;
	case 13:
		t14.setBackgroundResource(R.drawable.police);
		t14.setEnabled(true);
		t14.setOnClickListener(this);
		break;
	case 14:
		t15.setBackgroundResource(R.drawable.police);
		t15.setEnabled(true);
		t15.setOnClickListener(this);
		break;
	case 15:
		t16.setBackgroundResource(R.drawable.police);
		t16.setEnabled(true);
		t16.setOnClickListener(this);
		break;}

	
}
	public void dakatVor()
	{
		mp_chor.start();
	Random ran=new Random();
	switch (ran.nextInt(14)) {
	case 0:
		t1.setBackgroundResource(R.drawable.chor);
		t1.setEnabled(true);
		t1.setOnClickListener(this);
		break;
	case 1:
		t2.setBackgroundResource(R.drawable.chor);
		t2.setEnabled(true);
		t2.setOnClickListener(this);
		break;
	case 2:
		t3.setBackgroundResource(R.drawable.chor);
		t3.setEnabled(true);
		t3.setOnClickListener(this);
		break;
	case 3:
		t4.setBackgroundResource(R.drawable.chor);
		t4.setEnabled(true);
		t4.setOnClickListener(this);
		break;
	case 4:
		t5.setBackgroundResource(R.drawable.chor);
		t5.setEnabled(true);
		t5.setOnClickListener(this);
		break;
	case 5:
		t6.setBackgroundResource(R.drawable.chor);
		t6.setEnabled(true);
		t6.setOnClickListener(this);
		break;
	case 6:
		t7.setBackgroundResource(R.drawable.chor);
		t7.setEnabled(true);
		t7.setOnClickListener(this);
		break;
	case 7:
		t8.setBackgroundResource(R.drawable.chor);
		t8.setEnabled(true);
		t8.setOnClickListener(this);
		break;
	case 8:
		t9.setBackgroundResource(R.drawable.chor);
		t9.setEnabled(true);
		t9.setOnClickListener(this);
		break;
	case 9:
		t10.setBackgroundResource(R.drawable.chor);
		t10.setEnabled(true);
		t10.setOnClickListener(this);
		break;
	case 10:
		t11.setBackgroundResource(R.drawable.chor);
		t11.setEnabled(true);
		t11.setOnClickListener(this);
		break;
	case 11:
		t12.setBackgroundResource(R.drawable.chor);
		t12.setEnabled(true);
		t12.setOnClickListener(this);
		break;
	case 12:
		t13.setBackgroundResource(R.drawable.chor);
		t13.setEnabled(true);
		t13.setOnClickListener(this);
		break;
	case 13:
		t14.setBackgroundResource(R.drawable.chor);
		t14.setEnabled(true);
		t14.setOnClickListener(this);
		break;
	case 14:
		t15.setBackgroundResource(R.drawable.chor);
		t15.setEnabled(true);
		t15.setOnClickListener(this);
		break;
	case 15:
		t16.setBackgroundResource(R.drawable.chor);
		t16.setEnabled(true);
		t16.setOnClickListener(this);
		break;

		}
	}
	public void scoreLekh()
	{          
				fakaKor();
				mp_over.start();
				checkAchievement();
				String scorename;
				SharedPreferences sph;
				sph=getApplicationContext().getSharedPreferences("Myprefh", 0);
				if(chapse>sph.getInt("Myprefh", 0)){
				Editor editor=sph.edit();
				editor.putInt("Myprefh",chapse);
				editor.commit();
				scorename="High Score: ";
				}
				else
				{
					scorename="Your Score: ";
				}
				LayoutInflater li=LayoutInflater.from(Survival.this);
				View view=li.inflate(R.layout.custom_dialog, null);
				Button ok=(Button)view.findViewById(R.id.ok);
				TextView dtext=(TextView)view.findViewById(R.id.dtext);
				TextView dtitel=(TextView)view.findViewById(R.id.titel);
				Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
				dtext.setTypeface(tf);
				dtitel.setTypeface(tf);
				AlertDialog.Builder builder=new AlertDialog.Builder(Survival.this);
				builder.setView(view);
				builder.setCancelable(false);
				final AlertDialog simpleDialog=builder.create();
				dtext.setText("Your Score: "+chapse);
				ok.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						Intent in=new Intent(Survival.this,MainActivity.class);
						startActivity(in);
						overridePendingTransition(R.anim.slide_left_in,0);
						simpleDialog.cancel();
					}
					
				});
				
				simpleDialog.show();
	}
	

	public void checkAchievement()
	{	
		if(chapse>25)
		{
			SharedPreferences sp25;
			sp25=getApplicationContext().getSharedPreferences("Mypref25", 0);
			if(1>sp25.getInt("Mypref25", 0)){
			Editor editor=sp25.edit();
			editor.putInt("Mypref25",1);
			editor.commit();
			Toast.makeText(getApplicationContext(), "Challenge 3: Done", Toast.LENGTH_LONG).show();
		}
		
		
			if(chapse>50)
			{
				SharedPreferences sp50;
				sp50=getApplicationContext().getSharedPreferences("Mypref50", 0);
				if(1>sp50.getInt("Mypref50", 0)){
				Editor editor=sp50.edit();
				editor.putInt("Mypref50",1);
				editor.commit();
				Toast.makeText(getApplicationContext(), "Challenge 4: Done", Toast.LENGTH_LONG).show();
			}
				}}	
	    }

	@Override
	public void onClick(View a) {
		// TODO Auto-generated method stub
		fakaKor();
		mp_click.start();
		chapse++;
		t17.setText("Score: "+chapse);
		//changeText();
		if(change==1)
		{
			chapse--;
			y=y+50;
			i=1;
			scoreLekh();
		}
	}
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp_chor.stop();
		mp_over.stop();
		mp_police.stop();
	}
	
}
