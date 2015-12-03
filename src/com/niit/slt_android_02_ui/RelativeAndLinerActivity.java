package com.niit.slt_android_02_ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class RelativeAndLinerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 创建一个线性布局
		LinearLayout layoutMain = new LinearLayout(this);
		layoutMain.setOrientation(LinearLayout.HORIZONTAL);
		setContentView(layoutMain);
		// LayoutInflater查找Layout文件夹下的XML布局文件，与findViewById()类似
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		RelativeLayout left = (RelativeLayout) inflater.inflate(
				R.layout.activity_relativeandliner_left, null);
		RelativeLayout right = (RelativeLayout) inflater.inflate(
				R.layout.activity_relativeandliner_right, null);
		// 设置相对布局子视图的参数
		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.WRAP_CONTENT,
				RelativeLayout.LayoutParams.WRAP_CONTENT);

		layoutMain.addView(left, 200, 200);
		layoutMain.addView(right, layoutParams);
	}

}
