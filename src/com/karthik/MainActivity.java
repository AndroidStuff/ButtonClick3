package com.karthik;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
	}

	//Note: There is no need to initialize Button class objects because the config in layout is sufficient to ignite the event
	public void clickAction(View v) { // Define the OnClick event
		switch (v.getId()) {
		case R.id.activity_main_button_click_me:
			Log.d(TAG, "Button Click Me, is clicked");
			break;
		case R.id.activity_main_button_click_me_too:
			Log.d(TAG, "Button Click Me Too, is clicked");
			break;
		default:
			Log.d(TAG, "some unknown button is clicked :(");
		}
	}	
}
