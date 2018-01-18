package com.zach.tools.Reference.Parents.Children;
import android.content.*;

public class Delivery {
	private ContentValues data;
	private int id=-1;
	
	public Delivery(ContentValues... cv){
		if(cv.length!=0){
			data=cv[0];
			if(data.containsKey("id")){
				this.id = data.get("id");
				data.remove("id");
			} else {
				data = new ContentValues();
			}
		}
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
