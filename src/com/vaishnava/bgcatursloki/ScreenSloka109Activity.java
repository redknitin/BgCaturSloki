package com.vaishnava.bgcatursloki;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ScreenSloka109Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen_sloka109);
//		
//		TextView tv = (TextView) findViewById(R.id.textView1);
//		Typeface fontHindi = Typeface.createFromAsset(getAssets(), "fonts/Ananda Lipi Bold Cn Bt.ttf");
//		tv.setTypeface(fontHindi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.screen_sloka109, menu);
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
	
	public void btnReadMore_click(View v) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vedabase.net/bg/10/9/en"));
		startActivity(browserIntent);
	}
}
