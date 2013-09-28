package com.example.notificationtest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NotiClickActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noti_click);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.noti_click, menu);
		return true;
	}

}
