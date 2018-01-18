package com.zach.tools.Reference.Parents;
import java.util.ArrayList;
import com.zach.tools.Reference.Parents.Children.*;
import android.database.sqlite.SQLiteDatabase;

public class Deliveries {

	private ArrayList<Delivery> dayDeliveries;
	
	
	public Deliveries(){
		dayDeliveries=new ArrayList<Delivery>();
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
