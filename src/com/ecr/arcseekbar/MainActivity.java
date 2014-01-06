package com.ecr.arcseekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final LinearLayout r1 = (LinearLayout) findViewById(R.id.l0);
		ArcSeekBar s = new ArcSeekBar(MainActivity.this);
		s.setLayoutParams(new LinearLayout.LayoutParams(555, 555));
		r1.addView(s);
	}

	 

}
