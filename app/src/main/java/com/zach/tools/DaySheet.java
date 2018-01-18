package com.zach.tools;
import android.app.*;
import android.os.*;
import android.content.*;
import com.zach.tools.Reference.*;
import java.util.*;
import android.widget.*;

public class DaySheet extends Activity
{
	private Date date;
	private dbHelper dbhelp;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daysheet);
		Long temptime = getIntent().getLongExtra("date",0);
		date = new Date(temptime);
		dbhelp=new dbHelper(this);
	}
	
}
