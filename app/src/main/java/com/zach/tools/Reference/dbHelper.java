package com.zach.tools.Reference;
import android.database.sqlite.*;
import android.content.*;
import android.database.*;
import java.util.*;

public class dbHelper extends SQLiteOpenHelper
{
	private static final String DB_NAME="Delivery.db";
	
	public dbHelper(Context con){
		super(con,DB_NAME,null,1);
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

	public void updateData(String table, int id, ContentValues bndl){
		SQLiteDatabase db = getWritableDatabase();
		db.update(table,bndl," id = ? ",new String[]{Integer.toString(id)});
	}

	public void saveData(String table, ContentValues bndl){
		SQLiteDatabase db = getWritableDatabase();
		db.insert(table,null,bndl);
	}

	public ArrayList<ContentValues> loadDataByColumn(String table, String column, String data){
		SQLiteDatabase db = getReadableDatabase();
		Cursor curs = db.rawQuery("SELECT * FROM "+table+" WHERE "+column+
		"="+data,null);
		ArrayList<ContentValues> results = new ArrayList<ContentValues>();
		curs.moveToFirst();
		while(!curs.isAfterLast()){
			ContentValues tempBundle = new ContentValues();
			for(int i=0;i<curs.getColumnCount();i++){
				String colName=curs.getColumnName(i);
				String colValue=curs.getString(i);
				tempBundle.put(colName,colValue);
			}
			results.add(tempBundle);
			curs.moveToNext();
		}
		curs.close();
		return results;
	}

	public ArrayList<ContentValues> loadData(String table){ 
		SQLiteDatabase db = getReadableDatabase();
		Cursor curs = db.rawQuery("SELECT * FROM "+table,null);
		ArrayList<ContentValues> results = new ArrayList<ContentValues>();
		curs.moveToFirst();
		while(!curs.isAfterLast()){
			ContentValues tempBundle = new ContentValues();
			for(int i=0;i<curs.getColumnCount();i++){
				String colName=curs.getColumnName(i);
				String colValue=curs.getString(i);
				tempBundle.put(colName,colValue);
			}
			results.add(tempBundle);
			curs.moveToNext();
		}
		curs.close();
		return results;
	}

	public ContentValues loadDataById(String table, int id){
		SQLiteDatabase db = getReadableDatabase();
		Cursor curs = db.rawQuery("SELECT * FROM "+table+" WHERE id="+id,null);
		curs.moveToFirst();
		if (curs.getCount()!=1){
			return null;
		}
		ContentValues results = new ContentValues();
		for(int i=0;i<curs.getColumnCount();i++){
			String colName = curs.getColumnName(i);
			String colData = curs.getString(i);
			results.put(colName,colData);
		}
		curs.close();
		return results;
	}

	public void setupTables(SQLiteDatabase db){
		
	}

	public void setupUpgrade(SQLiteDatabase db){
		
	}

}
