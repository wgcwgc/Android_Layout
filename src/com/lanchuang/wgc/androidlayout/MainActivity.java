package com.lanchuang.wgc.androidlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toast.makeText(this ,"开始运行，，，0" ,Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		Toast.makeText(this ,"开始运行，，，1" ,Toast.LENGTH_LONG).show();
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		Toast.makeText(this ,"开始运行，，，2" ,Toast.LENGTH_LONG).show();
		if(id == R.id.action_settings)
		{
			Toast.makeText(this ,"开始运行，，，3" ,Toast.LENGTH_LONG).show();
			return true;
		}
		else
			if(id == R.id.switch1)
			{
				Toast.makeText(this ,"开始运行，，，4" ,Toast.LENGTH_LONG).show();
				return true;
			}
		Toast.makeText(this ,"开始运行，，，5" ,Toast.LENGTH_LONG).show();
		return super.onOptionsItemSelected(item);
	}
	// Toast.makeText(this , "开始运行，，，6" , Toast.LENGTH_LONG).show();
}
