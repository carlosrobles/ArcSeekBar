/*
 *  Android ArcSeekBar.
 *  https://github.com/carlosrobles
 *  
 *  Copyright 2014 Carlos Robles
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


package com.ecr.arcseekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class ArcSeekBar extends SeekBar {

	 
	public ArcSeekBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		 
	}

	public ArcSeekBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		 
	}
	
	private Paint mBasePaint;
	private Paint mProgressPaint;
	private RectF mOval = new RectF(5, 5, 550, 550);
	private int defaultmax = 180;
	private int startAngle=180;
	private int strokeWidth=10;

	private int trackColor=0xFF000000;
	private int progressColor=0xFFFF0000;
	
	

	public void setOval(RectF mOval) {
		this.mOval = mOval;
	}

	 

	public void setStartAngle(int startAngle) {
		this.startAngle = startAngle;
	}

	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	public void setTrackColor(int trackColor) {
		this.trackColor = trackColor;
	}

	public void setProgressColor(int progressColor) {
		this.progressColor = progressColor;
	}

	public ArcSeekBar(Context context) {
		super(context);
		mBasePaint = new Paint();
		mBasePaint.setAntiAlias(true);
		mBasePaint.setColor(trackColor);
		mBasePaint.setStrokeWidth(strokeWidth);
		mBasePaint.setStyle(Paint.Style.STROKE);

		mProgressPaint = new Paint();
		mProgressPaint.setAntiAlias(true);
		mProgressPaint.setColor(progressColor);
		mProgressPaint.setStrokeWidth(strokeWidth);
		mProgressPaint.setStyle(Paint.Style.STROKE);

		setMax(defaultmax);// degrees

	 
	}

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawArc(mOval, startAngle, getMax(), false, mBasePaint);
		canvas.drawArc(mOval, startAngle, getProgress(), false, mProgressPaint);
		invalidate();
		//Log.i("ARC", getProgress()+"/"+getMax());
		 
	}

}
