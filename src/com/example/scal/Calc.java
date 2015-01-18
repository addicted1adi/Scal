package com.example.scal;

import java.util.Locale;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calc extends Activity {

	Button[] controlbutton=new Button[18];
	EditText res;
	TextToSpeech tts;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		
		//TextToSpeech
		tts=new TextToSpeech(getBaseContext(), new OnInitListener() {
			
			@Override
			public void onInit(int status) {
				// TODO Auto-generated method stub
				tts.setLanguage(Locale.getDefault());
				tts.setPitch(1.3f);
				tts.setSpeechRate(1.2f);
			}
		});
		
		//NumPad 0-9
		//123
		controlbutton[0]=(Button) findViewById(R.id.button1);
		controlbutton[1]=(Button) findViewById(R.id.button2);
		controlbutton[2]=(Button) findViewById(R.id.button3);
		//456
		controlbutton[4]=(Button) findViewById(R.id.button5);
		controlbutton[5]=(Button) findViewById(R.id.button6);
		controlbutton[6]=(Button) findViewById(R.id.button7);
		//789
		controlbutton[8]=(Button) findViewById(R.id.button9);
		controlbutton[9]=(Button) findViewById(R.id.button10);
		controlbutton[10]=(Button) findViewById(R.id.button11);
		///*-
		controlbutton[3]=(Button) findViewById(R.id.button4);
		controlbutton[7]=(Button) findViewById(R.id.button8);
		controlbutton[11]=(Button) findViewById(R.id.button12);
		//.0=+
		controlbutton[12]=(Button) findViewById(R.id.button13);
		controlbutton[13]=(Button) findViewById(R.id.button14);
		controlbutton[14]=(Button) findViewById(R.id.button15);
		controlbutton[15]=(Button) findViewById(R.id.button16);
		//result
		res=(EditText)findViewById(R.id.result);
		//res.setText("");
		//clear delete
		controlbutton[16]=(Button)findViewById(R.id.buttonClear);
		controlbutton[17]=(Button)findViewById(R.id.buttonBackSpace);
	}

	@Override
	protected void onStart() {
		//Assign action
		controlbutton[0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[0].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(controlbutton[0].getText().toString());
			}
		});
		controlbutton[1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[1].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(controlbutton[1].getText().toString());
			}
		});
		controlbutton[2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[2].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(controlbutton[2].getText().toString());
			}
		});
		controlbutton[4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[4].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(controlbutton[4].getText().toString());
			}
		});
		controlbutton[5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[5].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(controlbutton[5].getText().toString());
			}
		});
		controlbutton[6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[6].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[6].getText().toString());
			}
		});
		controlbutton[8].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[8].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[8].getText().toString());
			}
		});
		controlbutton[9].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[9].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[9].getText().toString());
			}
		});
		controlbutton[10].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[10].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[10].getText().toString());
			}
		});
		controlbutton[12].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak("Point",TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[12].getText().toString());
			}
		});
		controlbutton[13].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak(controlbutton[13].getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[13].getText().toString());
			}
		});
		controlbutton[3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak("Divide",TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[3].getText().toString());
			}
		});
		controlbutton[7].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak("Multiply",TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[7].getText().toString());
			}
		});
		controlbutton[11].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				tts.speak("Subtract",TextToSpeech.QUEUE_FLUSH,null);
				res.append(""+controlbutton[11].getText().toString());
			}
		});
		controlbutton[14].setOnClickListener(new View.OnClickListener() {
			
			@SuppressLint("NewApi")
			@Override
			public void onClick(View arg0) {
				// TODO 
				int p;
				float a1,a2;
				for (int i = 0; i < res.getText().length(); i++) {
					switch(res.getText().charAt(i)){
					case '+':
						p=i;
						try{
						a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
						a2=Float.parseFloat(res.getText().subSequence(p+1,res.getText().length()).toString());
						res.setText((String.valueOf(a1+a2)));
						tts.speak("Result is"+(String.valueOf(a1+a2)),TextToSpeech.QUEUE_FLUSH,null);
						break;
						
						}
						catch (NumberFormatException e) {
							// TODO: handle exception
							a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
							Toast.makeText(getBaseContext(), "Operand Missing", Toast.LENGTH_LONG).show();
							res.setText((String.valueOf(a1)));
							tts.speak("Result is"+(String.valueOf(a1)),TextToSpeech.QUEUE_FLUSH,null);
							break;
						}
					case '-':
						p=i;
						try{
						a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
						a2=Float.parseFloat(res.getText().subSequence(p+1,res.getText().length()).toString());
						res.setText((String.valueOf(a1-a2)));
						tts.speak("Result is"+(String.valueOf(a1-a2)),TextToSpeech.QUEUE_FLUSH,null);
						break;
						
						}
						catch (NumberFormatException e) {
							// TODO: handle exception
							a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
							Toast.makeText(getBaseContext(), "Operand Missing", Toast.LENGTH_LONG).show();
							res.setText((String.valueOf(a1)));
							tts.speak((String.valueOf(a1)),TextToSpeech.QUEUE_FLUSH,null);
						}
					case 'x':
						p=i;
						try{
						a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
						a2=Float.parseFloat(res.getText().subSequence(p+1,res.getText().length()).toString());
						res.setText((String.valueOf(a1*a2)));
						tts.speak("Result is"+(String.valueOf(a1*a2)),TextToSpeech.QUEUE_FLUSH,null);
						break;
						
						}
						catch (NumberFormatException e) {
							// TODO: handle exception
							a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
							Toast.makeText(getBaseContext(), "Operand Missing", Toast.LENGTH_LONG).show();
							res.setText((String.valueOf(a1)));
							tts.speak((String.valueOf(a1)),TextToSpeech.QUEUE_FLUSH,null);
						}
					case '/':
						p=i;
						try{
						a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
						a2=Float.parseFloat(res.getText().subSequence(p+1,res.getText().length()).toString());
						res.setText((String.valueOf(a1/a2)));
						tts.speak((String.valueOf(a1/a2)),TextToSpeech.QUEUE_FLUSH,null);
						break;
						
						}
						catch (NumberFormatException e) {
							// TODO: handle exception
							a1=Float.parseFloat(res.getText().subSequence(0,p).toString());
							Toast.makeText(getBaseContext(), "Operand Missing", Toast.LENGTH_LONG).show();
							res.setText((String.valueOf(a1)));
							tts.speak((String.valueOf(a1)),TextToSpeech.QUEUE_FLUSH,null);
						}
						
						}
				}
			}
		});
		controlbutton[15].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 
				res.append(""+controlbutton[15].getText().toString());
				tts.speak("Plus",TextToSpeech.QUEUE_FLUSH,null);

			}
		});		
		controlbutton[16].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				res.getText().clear();
				tts.speak("Data Cleared",TextToSpeech.QUEUE_FLUSH,null);
			}
		});
		controlbutton[17].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//char [] ar=
				res.getText().delete(res.getText().length()-1,res.getText().length());
				tts.speak(res.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
			}
		});	
		super.onStart();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calc, menu);
		return true;
	}

}
