package com.vellameita.watodo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawingBall extends View {

	public DrawingBall(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Rect ourRect = new Rect();
		ourRect.set(0, 0, canvas.getWidth(), canvas.getHeight()/2);
		
		Paint red = new Paint();
		red.setColor(Color.RED);
		red.setStyle(Paint.Style.FILL);
		
		canvas.drawRect(ourRect,red);
	}
	
}
