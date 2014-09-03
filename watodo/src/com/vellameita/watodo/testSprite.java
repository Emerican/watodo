package com.vellameita.watodo;

import android.app.Activity;
import android.os.Bundle;

public class testSprite extends Activity{
	DrawingBall v;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		v = new DrawingBall(this);
		setContentView(v);
	}
}
