package com.zach.tools.Reference;
import android.content.*;
import android.widget.*;
import com.zach.tools.*;

public class Constants {
	public static final String YEAR = "YEAR";
	public static final String MONTH = "MONTH";
	public static final String DAY = "DAY";
	public static final String DELIVERIES_TABLE = "deliveries";
	public static final String DATE_COLUMN ="date";
	
	public static void toastIt(String msg){
		Toast.makeText(MainActivity.getAppContext(),msg,Toast.LENGTH_SHORT).show();
	}
	
}
