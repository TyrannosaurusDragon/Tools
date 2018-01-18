package com.zach.tools.Reference;
import android.content.*;
import android.widget.*;

public class Constants {
	public static final String YEAR = "YEAR";
	public static final String MONTH = "MONTH";
	public static final String DAY = "DAY";
	public static final String DELIVERIES_TABLE = "deliveries";
	
	public static void toastIt(Context con, String msg, boolean elongated){
		int tempint = Toast.LENGTH_SHORT;
		if(elongated){
			tempint = Toast.LENGTH_LONG;
		}
		
		Toast.makeText(con,msg,tempint).show();
	}
	
}
