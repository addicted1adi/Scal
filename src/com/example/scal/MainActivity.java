package com.example.scal;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	ImageButton[] ib=new ImageButton[4];
	Intent i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ib[0]=(ImageButton)findViewById(R.id.imageButton2);
		ib[0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			 Toast.makeText(getBaseContext(), "Cilcked", Toast.LENGTH_LONG).show();
			 i=new Intent(getBaseContext(),Calc.class);
			 startActivity(i);
			 finish();
			}
		});		
		ib[1]=(ImageButton)findViewById(R.id.imageButton1);
		ib[2]=(ImageButton)findViewById(R.id.imageButton3);
		ib[3]=(ImageButton)findViewById(R.id.imageButton4);

		ib[1].setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
			//i=new Intent(getBaseContext(),Calc.class);
			}
		});
		ib[2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			//i=new Intent(getBaseContext(),Calc.class);
			}
		});
		ib[3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			//i=new Intent(getBaseContext(),Calc.class);
			}
		});
	}
	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
