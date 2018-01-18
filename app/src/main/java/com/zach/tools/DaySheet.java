package com.zach.tools;
import android.app.*;
import android.os.*;
import android.content.*;
import com.zach.tools.Reference.*;

public class DaySheet extends Activity
{
	private Bundle dataBundle;
	private dbHelper dbhelp;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daysheet);
		dataBundle = getIntent().getBundleExtra("date");
		if(dataBundle==null){
			dataBundle=new Bundle();
		}
		dbhelp=new dbHelper(this,"Deliveries");
	}
	
}
