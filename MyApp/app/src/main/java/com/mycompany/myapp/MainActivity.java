package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity 
{
	// Object yang di bentuk sebagai tombol
	ImageView img;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
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
