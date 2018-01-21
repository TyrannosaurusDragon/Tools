package com.zach.tools.Reference.Parents;
import java.util.ArrayList;
import com.zach.tools.Reference.Parents.Children.*;
import com.zach.tools.Reference.*;
import android.content.*;

public class Deliveries {

	private ArrayList<Delivery> dayDeliveries;
	private dbHelper db;
	private CalendarDate meDate;
	
	public Deliveries(dbHelper database, CalendarDate dat){
		dayDeliveries=new ArrayList<Delivery>();
		db = database;
		meDate=dat;
		setupDeliveries();
	}

	public void setupDeliveries(){
		dayDeliveries.clear();
		ArrayList<ContentValues> tempArray = db.loadDataByColumn(
		Constants.DELIVERIES_TABLE,
		Constants.DATE_COLUMN,
		meDate.getTimeStamp());
	
		for(ContentValues v : tempArray){
			Delivery d = new Delivery(v);
			dayDeliveries.add(d);
		}
	}

	public void saveById(int i){
		for(Delivery d : dayDeliveries){
			if(d.getId()==i){
				db.saveData(Constants.DELIVERIES_TABLE,d.getCv());
				return;
			}
		}
	}

	public void saveAll(){
		for(Delivery v : dayDeliveries){
			db.saveData(Constants.DELIVERIES_TABLE,v.getCv());
		}
	}
	
	public ArrayList<Delivery> getAllDeliveries(){
		return dayDeliveries;
	}
	
	public Delivery getDeliveryById(int id){
		for(Delivery d:dayDeliveries){
			if(d.getId()==id){
				return d;
			}
		}
		return null;
	}
}
