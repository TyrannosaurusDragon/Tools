package com.zach.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.*;
import android.widget.*;
import android.icu.util.*;
import android.widget.CalendarView.*;
import android.widget.DatePicker.*;
import java.util.HashMap;
import com.zach.tools.Reference.Constants;
import com.zach.tools.Reference.*;


public class MainActivity extends Activity 
{
	DatePicker cal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		Calendar today = Calendar.getInstance();
		cal = (DatePicker)findViewById(R.id.calendar);
	
		cal.init( today.get(Calendar.YEAR),
			today.get(Calendar.MONTH),
			today.get(Calendar.DAY_OF_MONTH),
			new OnDateChangedListener(){

				@Override
				public void onDateChanged(DatePicker view,
										  int year,
										  int monthOfYear,
										  int dayOfMonth) {
					dateClicked(year,monthOfYear,dayOfMonth);
				}});
	}

	private void dateClicked(int year, int month, int dayofmonth){
	
		Intent daySheet = new Intent(MainActivity.this,DaySheet.class);
		CalendarDate cdate = new CalendarDate(year,month,dayofmonth);
		daySheet.putExtra("date",cdate.getTimeStamp());
		startActivity(daySheet);
	}
}
