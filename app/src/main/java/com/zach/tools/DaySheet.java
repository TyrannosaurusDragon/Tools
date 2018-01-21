package com.zach.tools;
import android.app.*;
import android.os.*;
import com.zach.tools.Reference.*;
import android.widget.*;
import com.zach.tools.Reference.Parents.*;

public class DaySheet extends Activity
{
	private CalendarDate cd;
	private dbHelper dbhelp;
	private Deliveries dels;
	private ListView delList;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daysheet);
		String temptime = getIntent().getStringExtra("date");
		cd = new CalendarDate(temptime);
		dbhelp=new dbHelper(this);
		dels = new Deliveries(dbhelp,cd);
		delList = (ListView)findViewById(R.id.deliveryList);
	
		
	}

	
	
}
