package com.tazwar.dhor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Achievements extends Activity implements OnClickListener{
ImageView t1,t2,t3,t4,t5,t6;
LinearLayout l1,l2,l3,l4,l5,l6;
int i75=0,i100=0,i25=0,i50=0,il=0;
TextView tx1,tx2,tx3,tx4,tx5,tx6;
MediaPlayer mp;
Button back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_achievements);
		t1=(ImageView)findViewById(R.id.imageView1);
		t2=(ImageView)findViewById(R.id.imageView2);
		t3=(ImageView)findViewById(R.id.imageView3);
		t4=(ImageView)findViewById(R.id.imageView4);
		t5=(ImageView)findViewById(R.id.imageView5);
		t6=(ImageView)findViewById(R.id.imageView6);
		tx1=(TextView)findViewById(R.id.textView1);
		tx2=(TextView)findViewById(R.id.textView2);
		tx3=(TextView)findViewById(R.id.textView3);
		tx4=(TextView)findViewById(R.id.textView4);
		tx5=(TextView)findViewById(R.id.textView5);
		tx6=(TextView)findViewById(R.id.textView6);
		Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/witb.ttf");
		tx1.setTypeface(tf);
		tx2.setTypeface(tf);
		tx3.setTypeface(tf);
		tx4.setTypeface(tf);
		tx5.setTypeface(tf);
		tx6.setTypeface(tf);
		l1=(LinearLayout)findViewById(R.id.l1);
		l2=(LinearLayout)findViewById(R.id.l2);
		l3=(LinearLayout)findViewById(R.id.l3);
		l4=(LinearLayout)findViewById(R.id.l4);
		l5=(LinearLayout)findViewById(R.id.l5);
		l6=(LinearLayout)findViewById(R.id.l6);
		l1.setOnClickListener(this);
		l2.setOnClickListener(this);
		l3.setOnClickListener(this);
		l4.setOnClickListener(this);
		l5.setOnClickListener(this);
		l6.setOnClickListener(this);
		achievement100();
		achievement25();
		achievement50();
		achievement75();
		achievementl1();
		back=(Button)findViewById(R.id.bbutton);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in=new Intent(Achievements.this,MainActivity.class);
				startActivity(in);
				overridePendingTransition(R.anim.slide_left_in,0);
			}
		});
	}

	
	public void achievement75()
	{
		SharedPreferences sp75;
		sp75=getApplicationContext().getSharedPreferences("Mypref75", 0);
		 i75=sp75.getInt("Mypref75", 0);
		if (i75==0)
		{
			t1.setImageResource(R.drawable.undone);
		}
		else if(i75==1)
		{
			t1.setImageResource(R.drawable.done);
		}
	}
	public void achievement100()
	{
		SharedPreferences sp100;
		sp100=getApplicationContext().getSharedPreferences("Mypref100", 0);
		i100=sp100.getInt("Mypref100", 0);
		if (i100==0)
		{
			t2.setImageResource(R.drawable.undone);
		}
		else if(i100==1)
		{
			t2.setImageResource(R.drawable.done);
		}
	}
	public void achievement25()
	{
		SharedPreferences sp25;
		sp25=getApplicationContext().getSharedPreferences("Mypref25", 0);
		i25=sp25.getInt("Mypref25", 0);
		if (i25==0)
		{
			t3.setImageResource(R.drawable.undone);
		}
		else if(i25==1)
		{
			t3.setImageResource(R.drawable.done);
		}
	}
	public void achievement50()
	{
		SharedPreferences sp50;
		sp50=getApplicationContext().getSharedPreferences("Mypref50", 0);
		i50=sp50.getInt("Mypref50", 0);
		if (i50==0)
		{
			t4.setImageResource(R.drawable.undone);
		}
		else if(i50==1)
		{
			t4.setImageResource(R.drawable.done);
		}
	}
	
	public void achievementl1()
	{
		SharedPreferences spl;
		spl=getApplicationContext().getSharedPreferences("Myprefl", 0);
		il=spl.getInt("Myprefl", 0);
		if (il>10000&&il<=100000)
		{
			t6.setImageResource(R.drawable.undone);
			t5.setImageResource(R.drawable.done);
		}
		else if(il>100000)
		{
			t5.setImageResource(R.drawable.done);
			t6.setImageResource(R.drawable.done);
		}
		else
		{
			t5.setImageResource(R.drawable.undone);
			t6.setImageResource(R.drawable.undone);
		}
	}

	@Override
	public void onClick(View a) {
		mp=MediaPlayer.create(this, R.raw.click);
		mp.setLooping(false);
		mp.start();
		// TODO Auto-generated method stub
		if(a.getId()==R.id.l1)
		{
			if(i75==1)
				Toast.makeText(getApplicationContext(), "Challenge 1: done", Toast.LENGTH_SHORT).show();
			else if(i75==0)
				Toast.makeText(getApplicationContext(), "Challenge 1: undone", Toast.LENGTH_SHORT).show();				
		}
		if(a.getId()==R.id.l2)
		{
			if(i100==1)
				Toast.makeText(getApplicationContext(), "Challenge 2: done", Toast.LENGTH_SHORT).show();
			else if(i100==0)
				Toast.makeText(getApplicationContext(), "Challenge 2: undone", Toast.LENGTH_SHORT).show();

		}
		if(a.getId()==R.id.l3)
		{
			if(i25==1)
				Toast.makeText(getApplicationContext(), "Challenge 4: done", Toast.LENGTH_SHORT).show();
			else if(i25==0)
				Toast.makeText(getApplicationContext(), "Challenge 4: undone", Toast.LENGTH_SHORT).show();

		}
		if(a.getId()==R.id.l4)
		{
			if(i50==1)
				Toast.makeText(getApplicationContext(), "Challenge 5: done", Toast.LENGTH_SHORT).show();
			else if(i50==0)
				Toast.makeText(getApplicationContext(), "Challenge 5: undone", Toast.LENGTH_SHORT).show();

		}
		
		if(a.getId()==R.id.l5)
		{
			if(il>10000)
				Toast.makeText(getApplicationContext(), "Challenge 3: done", Toast.LENGTH_SHORT).show();
			else
				Toast.makeText(getApplicationContext(), "Lifetime hit: "+il, Toast.LENGTH_SHORT).show();
		}
		if(a.getId()==R.id.l6)
		{
			if(il>100000)
				Toast.makeText(getApplicationContext(), "Challenge 6: done", Toast.LENGTH_SHORT).show();
			else
				Toast.makeText(getApplicationContext(), "Lifetime hit: "+il, Toast.LENGTH_SHORT).show();
		}
			
		
	}

}
