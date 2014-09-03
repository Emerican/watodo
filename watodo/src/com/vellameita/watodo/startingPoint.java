package com.vellameita.watodo;
import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
 
public class startingPoint extends Activity {
	int counter;
	//Button link;
	Button add;
	Button sub;
	Button testSprite;
	TextView display;
	
		
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		counter = 0;
		
	//link = (Button) findViewById(R.id.bLink);
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		testSprite = (Button) findViewById(R.id.testSprite);
		display = (TextView) findViewById(R.id.tvDisplay);
		add.setOnClickListener(new View.OnClickListener() {					
			public void onClick(View v) {	
				counter++;
				display.setText("You have raped " +counter + " pokemon");
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {					
			public void onClick(View v) {	
				counter--;
				display.setText("You still have raped " + counter + " pokemon");
			}
		});	
		testSprite.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent openTestSprite = new Intent("com.vellameita.watodo.TESTSPRITE");
				startActivity(openTestSprite);
			}
		});
	/*	link.setOnClickListener(new View.OnClickListener(){
		public void onClick(View v) {
		Uri uri = Uri.parse("http://www.strautmanis.lv");
		        Intent callLink = new Intent(Intent.ACTION_VIEW, uri);
		       startActivity(callLink); 
			}
		});*/
		
	}
}
