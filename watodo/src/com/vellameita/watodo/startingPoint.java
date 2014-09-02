package com.vellameita.watodo;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
 
public class startingPoint extends Activity {
	int counter;
	Button link;
	Button add;
	Button sub;
	TextView display;
		
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		counter = 0;
		
		link = (Button) findViewById(R.id.bLink);
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tvDisplay);
		add.setOnClickListener(new View.OnClickListener() {					
			public void onClick(View v) {	
				counter++;
				display.setText("Added One " +counter);
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {					
			public void onClick(View v) {	
				counter--;
				display.setText("Subbed One " + counter);
			}
		});
		
		link.setOnClickListener(new View.OnClickListener(){
		public void onClick(View v) {
		Uri uri = Uri.parse("http://www.strautmanis.lv");
		        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		       startActivity(intent); 
			}
		});
		
	}
}
