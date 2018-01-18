package com.zach.tools.Reference;

public class CalendarDate
{
	private int cDateStamp;
	private int year;
	private int month;
	private int day;
	
	public CalendarDate(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
		cDateStamp = dateCombiner(this.year,this.month,this.day);
	}
	
	public CalendarDate(int cstamp){
		int[] temp = dateUnwinder(cstamp);
		new CalendarDate(temp[0],temp[1],temp[2]);
	}
	
	public static int[] dateUnwinder(int full){
		String tempString = Integer.toString(full);
		char[] tempChar = tempString.toCharArray();
		char[] tempYear = {tempChar[0],tempChar[1],tempChar[2],tempChar[3]};
		char[] tempMonth = {tempChar[4],tempChar[5]};
		char[] tempDay = {tempChar[6],tempChar[7]};
		int yS = Integer.parseInt(String.copyValueOf(tempYear));
		int mS = Integer.parseInt(String.copyValueOf(tempMonth));
		int dS = Integer.parseInt(String.copyValueOf(tempDay));
		int[] jesus = {yS,mS,dS};
		return jesus;
	}
	
	public static int dateCombiner(int y, int m, int d){
		String temp = y+""+m+""+d;
		return Integer.parseInt(temp);
	}
	
	public int getTimeStamp(){
		return cDateStamp;
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
