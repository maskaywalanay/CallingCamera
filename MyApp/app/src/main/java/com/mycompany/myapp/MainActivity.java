package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.animation.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	// Object yang di bentuk sebagai tombol
	ImageView img;
	TextView textView;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		// menampilkan toast saat pertama di luncurkan
		Toast.makeText(this,"Clicks A Icon To Launch Camera",Toast.LENGTH_SHORT).show();
		
		// menemukan text dengan id
		textView = (TextView)findViewById(R.id.camera_title);
		textView.setText("^^ Camera Button ^^");
		
		// Membuat text berkedip dengan object animator
		ObjectAnimator texts = ObjectAnimator.ofInt(textView,"textColor",Color.BLACK,Color.TRANSPARENT);
		// durasi kedip 1 detik
		texts.setDuration(1000);
		texts.setEvaluator(new ArgbEvaluator());
		// Reverse sedikit kedip
		// Infinite terus menerus berkedip
		texts.setRepeatCount(ValueAnimator.INFINITE);
		
		// looping kedip 
		texts.setRepeatMode(ValueAnimator.RESTART);
		
		// kedip dimulai
		texts.start();
		
		// menemukan object dengan id 
		img = (ImageView)findViewById(R.id.img);
		// membuat object aktif saat di klik
		img.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				// object akan me
				Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
				startActivity(i);
			}
		});
		
    }
}
