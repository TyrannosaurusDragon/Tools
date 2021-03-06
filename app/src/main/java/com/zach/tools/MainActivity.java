package com.zach.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.widget.DatePicker.*;
import com.zach.tools.Reference.*;
import android.content.*;

import java.util.Calendar;


public class MainActivity extends Activity 
{
	private static MainActivity ma;
	DatePicker cal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		Calendar today = Calendar.getInstance();
		cal = (DatePicker)findViewById(R.id.calendar);
		ma=this;
	
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
		daySheet.putExtra("date",CalendarDate.dateCombiner(year,month,dayofmonth));
		startActivity(daySheet);
	}

	public static Context getAppContext(){
		return ma.getApplicationContext();
	}
}
