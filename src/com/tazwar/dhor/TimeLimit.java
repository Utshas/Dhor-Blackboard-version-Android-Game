package com.tazwar.dhor;

import java.util.Random;
import android.media.MediaPlayer;
import android.os.Bundle;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TimeLimit extends Activity implements OnClickListener{
TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
int chapse=0,total=0,police1=0,police2=0,dakat=0;
Button back;
MediaPlayer mp_click,mp_chor,mp_police,mp_over,mp_double;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timelimit);
		
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
		mp_double=MediaPlayer.create(this, R.raw.double_chor);
		mp_double.setLooping(false);
		changeText();
		setPolice();
		back=(Button)findViewById(R.id.bbutton);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in=new Intent(TimeLimit.this,MainActivity.class);
				startActivity(in);
				onPause();
			}
		});
	}

	
	public void changeText()
	{
		Handler h= new Handler();
		h.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				fakaKor();
				if(total==police1 || total==police2)
					policeVor();
				else if(total==dakat)
				dakatVor();
				else
				lekhaVor();
				scoreLekh();
			}
		},999);
		
			
	}

	public void fakaKor()
	{
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
	}
	public void lekhaVor()
	{
		mp_chor.start();
		Random ran=new Random();
		switch (ran.nextInt(15)) {
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
	{total++;
		t17.setText(" Hitted "+chapse+" times within "+total+ "secs");
		if (total<30)
		changeText();
		else
				{
			    mp_over.start();
				fakaKor();
				checkAchievement();
				SharedPreferences sp;
				sp=getApplicationContext().getSharedPreferences("Mypref", 0);
				if(chapse>sp.getInt("Mypref", 0)){
				Editor editor=sp.edit();
				editor.putInt("Mypref",chapse);
				editor.commit();
				}
				else
				{
				}
				LayoutInflater li=LayoutInflater.from(TimeLimit.this);
				View view=li.inflate(R.layout.custom_dialog, null);
				Button ok=(Button)view.findViewById(R.id.ok);
				TextView dtext=(TextView)view.findViewById(R.id.dtext);
				TextView dtitel=(TextView)view.findViewById(R.id.titel);
				Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
				dtext.setTypeface(tf);
				dtitel.setTypeface(tf);
				AlertDialog.Builder builder=new AlertDialog.Builder(TimeLimit.this);
				builder.setView(view);
				builder.setCancelable(false);
				final AlertDialog simpleDialog=builder.create();
				dtext.setText("Your Score: "+chapse);
				ok.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						Intent in=new Intent(TimeLimit.this,MainActivity.class);
						startActivity(in);
						overridePendingTransition(R.anim.slide_left_in,0);
						simpleDialog.cancel();
					}
					
				});
				simpleDialog.show();
				
				}
			}
	public void checkAchievement()
	{	SharedPreferences spl;
		spl=getApplicationContext().getSharedPreferences("Myprefl", 0);
		int iss=spl.getInt("Myprefl", 0);
		iss=iss+chapse;
		Editor editors=spl.edit();
		editors.putInt("Myprefl",iss);
		editors.commit();
		if(iss>10000 && iss<10100)
		Toast.makeText(getApplicationContext(), "Challenge 3: Done", Toast.LENGTH_LONG).show();
		else if(iss>100000&& iss<100100)
		Toast.makeText(getApplicationContext(), "Challenge 5: Done", Toast.LENGTH_LONG).show();
		else;
		
		if(chapse>75)
		{
			SharedPreferences sp75;
			sp75=getApplicationContext().getSharedPreferences("Mypref75", 0);
			if(1>sp75.getInt("Mypref75", 0)){
			Editor editor=sp75.edit();
			editor.putInt("Mypref75",1);
			editor.commit();
			Toast.makeText(getApplicationContext(), "Challenge 1: Done", Toast.LENGTH_LONG).show();
		}
		
		
			if(chapse>100)
			{
				SharedPreferences sp100;
				sp100=getApplicationContext().getSharedPreferences("Mypref100", 0);
				if(1>sp100.getInt("Mypref100", 0)){
				Editor editor=sp100.edit();
				editor.putInt("Mypref100",1);
				editor.commit();
				Toast.makeText(getApplicationContext(), "Challenge 2: Done", Toast.LENGTH_LONG).show();
			}
				if(chapse>125)
				{
					SharedPreferences sp125;
					sp125=getApplicationContext().getSharedPreferences("Mypref125", 0);
					if(1>sp125.getInt("Mypref125", 0)){
					Editor editor=sp125.edit();
					editor.putInt("Mypref125",1);
					editor.commit();
					Toast.makeText(getApplicationContext(), "Challenge 4: Done", Toast.LENGTH_LONG).show();
				}
		}}}
		
	}
	public void setPolice()
	{
		Random rann=new Random();
		police1=5+rann.nextInt(7);
		police2=police1+9+rann.nextInt(4);
		dakat=police1+1+rann.nextInt(9);
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
		break;

		}
	}
	public void dakatVor()
	{
		mp_double.start();
		Random ran=new Random();
	switch (ran.nextInt(14)) {
	case 0:
		//t1.setText("Dhor");
		t1.setBackgroundResource(R.drawable.cor2);
		t1.setEnabled(true);
		t1.setOnClickListener(this);
		break;
	case 1:
		t2.setBackgroundResource(R.drawable.cor2);
		t2.setEnabled(true);
		t2.setOnClickListener(this);
		break;
	case 2:
		t3.setBackgroundResource(R.drawable.cor2);
		t3.setEnabled(true);
		t3.setOnClickListener(this);
		break;
	case 3:
		t4.setBackgroundResource(R.drawable.cor2);
		t4.setEnabled(true);
		t4.setOnClickListener(this);
		break;
	case 4:
		t5.setBackgroundResource(R.drawable.cor2);
		t5.setEnabled(true);
		t5.setOnClickListener(this);
		break;
	case 5:
		t6.setBackgroundResource(R.drawable.cor2);
		t6.setEnabled(true);
		t6.setOnClickListener(this);
		break;
	case 6:
		t7.setBackgroundResource(R.drawable.cor2);
		t7.setEnabled(true);
		t7.setOnClickListener(this);
		break;
	case 7:
		t8.setBackgroundResource(R.drawable.cor2);
		t8.setEnabled(true);
		t8.setOnClickListener(this);
		break;
	case 8:
		t9.setBackgroundResource(R.drawable.cor2);
		t9.setEnabled(true);
		t9.setOnClickListener(this);
		break;
	case 9:
		t10.setBackgroundResource(R.drawable.cor2);
		t10.setEnabled(true);
		t10.setOnClickListener(this);
		break;
	case 10:
		t11.setBackgroundResource(R.drawable.cor2);
		t11.setEnabled(true);
		t11.setOnClickListener(this);
		break;
	case 11:
		t12.setBackgroundResource(R.drawable.cor2);
		t12.setEnabled(true);
		t12.setOnClickListener(this);
		break;
	case 12:
		t13.setBackgroundResource(R.drawable.cor2);
		t13.setEnabled(true);
		t13.setOnClickListener(this);
		break;
	case 13:
		t14.setBackgroundResource(R.drawable.cor2);
		t14.setEnabled(true);
		t14.setOnClickListener(this);
		break;
	case 14:
		t15.setBackgroundResource(R.drawable.cor2);
		t15.setEnabled(true);
		t15.setOnClickListener(this);
		break;
	case 15:
		t16.setBackgroundResource(R.drawable.cor2);
		t16.setEnabled(true);
		t16.setOnClickListener(this);
		break;
		}
	}
	@Override
	public void onClick(View a) {
		mp_click.start();
		// TODO Auto-generated method stub
		if(total==police1+1 || total==police2+1)
		{
			chapse=chapse-1;
		}
		else if (total==dakat+1)
		{
			chapse=chapse+5;
		}
		else
		{chapse++;}
	}
	
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp_chor.stop();
		mp_double.stop();
		mp_over.stop();
		mp_police.stop();
	}

}

