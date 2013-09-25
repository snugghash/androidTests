package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.SaveCallback;

import com.parse.ParseUser;

import android.app.Application;
import android.widget.Toast;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "dCzrGMnDtsc7uSyHasPlyX7yzNsXGECK34bm2qX2",
				"ogBpdepWw3mxS7yu1yczeZ47tmrPLn17GOYTdtgF");

		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();

		// If you would like all objects to be private by default, remove this
		// line.
		defaultACL.setPublicReadAccess(true);

		ParseACL.setDefaultACL(defaultACL, true);

		ParseObject testObject = new ParseObject("TestObject2");
		testObject.put("foo2", "bar2");
		testObject.saveInBackground(new SaveCallback() {
			
			@Override
			public void done(com.parse.ParseException e) {
				if (e == null) {
					Toast toast = Toast.makeText(getApplicationContext(),
							"Success", Toast.LENGTH_SHORT);
					toast.show();
				} else {
					e.printStackTrace();

					Toast toast = Toast.makeText(getApplicationContext(),
							"Failed", Toast.LENGTH_SHORT);
					toast.show();
				}	
			}

		});
	}

}
