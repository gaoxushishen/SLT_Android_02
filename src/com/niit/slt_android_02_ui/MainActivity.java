package com.niit.slt_android_02_ui;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btnLinerLayout;
	private Button btnTableLayout;
	private Button btnFrameLayout;
	private Button btnRelativeLayout;
	private Button btnRelativeAndLiner;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnLinerLayout = (Button)findViewById(R.id.btn_linerlayout);
		btnLinerLayout.setOnClickListener(this);
		btnTableLayout = (Button)findViewById(R.id.btn_tablelayout);
		btnTableLayout.setOnClickListener(this);
		btnFrameLayout = (Button)findViewById(R.id.btn_framelayout);
		btnFrameLayout.setOnClickListener(this);
		btnRelativeLayout = (Button)findViewById(R.id.btn_relativelayout);
		btnRelativeLayout.setOnClickListener(this);
	
		btnRelativeAndLiner = (Button)findViewById(R.id.btn_relativeandliner);
		btnRelativeAndLiner.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_linerlayout:
			startActivity(new Intent(MainActivity.this,LinerLayoutActivity.class));
			break;
		case R.id.btn_tablelayout:
			startActivity(new Intent(MainActivity.this,TableLayoutActivity.class));
			break;
		case R.id.btn_framelayout:
			startActivity(new Intent(MainActivity.this,FrameLayoutActivity.class));
			break;
		case R.id.btn_relativelayout:
			startActivity(new Intent(MainActivity.this,RelativeLayoutActivity.class));
			break;
		case R.id.btn_relativeandliner:
			startActivity(new Intent(MainActivity.this,RelativeAndLinerActivity.class));
			break;
		default:
			break;
		}
		
	}
	
	
}
