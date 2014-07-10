package com.lee.geslocinfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	 TextView strview;
	 Switch blue;
	 Button exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findviews();
	}

	public void findviews()
	{
		strview = (TextView) findViewById(R.id.strview);
		blue =(Switch)findViewById(R.id.blueswt);
		exit =(Button)findViewById(R.id.btnexit);
		
		blue.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			   
			   @Override
			   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			    if(isChecked) {
			     //选中时 do some thing 
			    strview.setText(R.string.switchon);
			    } else {
			     //非选中时 do some thing 
			    strview.setText(R.string.switchoff);
			    }
			    
			   }
			  });
		
	     exit.setOnClickListener(new Button.OnClickListener(){//创建监听    
	            public void onClick(View v) { 
	            	String msg = "界面退出~";
	            	Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
	                MainActivity.this.finish();    
	            }    
	  
	        });    
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

}
