package com.zach.tools.Reference;
import com.zach.tools.*;

public class CalendarDate
{
	private int year;
	private int month;
	private int day;
	
	public CalendarDate(int years, int months, int days){
		this.year=years;
		this.month=months;
		this.day=days;
	}
	
	public CalendarDate(String cstamp){
		int[] temp = dateUnwinder(cstamp);
		this.year=temp[0];
		this.month=temp[1];
		this.day=temp[2];
	}
	
	public static int[] dateUnwinder(String full){
		int yS = Integer.parseInt(full.substring(0,4));
		int mS = Integer.parseInt(full.substring(4,6));
		int dS = Integer.parseInt(full.substring(6,8));
		int[] jesus = {yS,mS,dS};
		return jesus;
	}
	
	public static String dateCombiner(int y, int m, int d){
		String ms = Integer.toString(m);
		String ds = Integer.toString(d);
		if(m<10){
			ms="0"+ms;
		}
		if(d<10){
			ds="0"+ds;
		}
		String temp = y+""+ms+""+ds;
		return temp;
	}
	
	public String getTimeStamp(){
		return dateCombiner(year,month,day);
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setYear(int yAar){
		this.year=yAar;
	}
	
	public void setMonth(int mOnth){
		this.month=mOnth;
	}
	
	public void setDay(int dat){
		this.day=dat;
	}
}
