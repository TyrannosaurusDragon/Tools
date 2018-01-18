package com.zach.tools;
import android.app.*;
import android.os.*;
import android.content.*;
import com.zach.tools.Reference.*;
import java.util.*;
import android.widget.*;

public class DaySheet extends Activity
{
	private CalendarDate cd;
	private dbHelper dbhelp;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daysheet);
		int temptime = getIntent().getIntExtra("date",0);
		cd = new CalendarDate(temptime);
		dbhelp=new dbHelper(this);
	}
	
}
