package com.zach.tools.Reference.Parents.Children;
import android.content.*;
import java.sql.*;

public class Delivery {
	private ContentValues data;
	private int id=-1;
	
	public Delivery(ContentValues cv){
		data=cv;
		if(data.containsKey("id")){
			this.id = data.get("id");
			data.remove("id");
		}
	}

	public ContentValues getCv(){
		return data;
	}
	
	public void setValue(String key, String value){
		data.put(key,value);
	}
	
	public Object getValue(String key){
		return data.get(key);
	}
	
	public int getId(){
		return id;
	}
}
