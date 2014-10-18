package com.vaishnava.bgcatursloki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void btnSloka108_click(View v) {
		startActivity(new Intent(this, ScreenSloka108Activity.class));
	}
	
	public void btnSloka109_click(View v) {
		startActivity(new Intent(this, ScreenSloka109Activity.class));
	}
	
	public void btnSloka1010_click(View v) {
		startActivity(new Intent(this, ScreenSloka1010Activity.class));
	}
	
	public void btnSloka1011_click(View v) {
		startActivity(new Intent(this, ScreenSloka1011Activity.class));
	}
}
