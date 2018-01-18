package com.zach.tools.Reference;
import android.database.sqlite.*;
import android.content.*;
import android.os.*;
import android.database.*;
import java.util.*;

public class dbHelper extends SQLiteOpenHelper
{
	private static final String DB_NAME="Delivery.db";
	private String DB_TABLE;
	
	public dbHelper(Context con, String table){
		super(con,DB_NAME,null,1);
		DB_TABLE=table;
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		setupTables(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int p2, int p3)
	{
		setupUpgrade(db);
	}

	public void updateData(String table, int id, Bundle bndl){
		
	}

	public void saveData(String table, Bundle bndl){
		
	}

	public ArrayList<Bundle> loadData(String table){ 
		SQLiteDatabase db = getReadableDatabase();
		Cursor curs = db.rawQuery("SELECT * FROM "+table,null);
		ArrayList<Bundle> results = new ArrayList<Bundle>();
		curs.moveToFirst();
		while(!curs.isAfterLast()){
			Bundle tempBundle = new Bundle();
			for(int i=0;i<curs.getColumnCount();i++){
				String colName=curs.getColumnName(i);
				String colValue=curs.getString(i);
				tempBundle.putString(colName,colValue);
			}
			results.add(tempBundle);
			curs.moveToNext();
		}
		return results;
	}

	public Bundle loadDataById(String table, int id){
		return null;
	}

	public void setupTables(SQLiteDatabase db){
		
	}

	public void setupUpgrade(SQLiteDatabase db){
		
	}

}
