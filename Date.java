

import java.lang.*;
public class Date{
	private int year;
	private int month;
	private int day;
	public Date(){
		year = 1000;
		month = 1;
		day = 1;
	}
	public Date(int year,int month, int day){
		setDate(year, month, day);
	}

	public int getYear(){	
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		if (year < 1000 && year > 9999){
			throw new IllegalArgumentException("error in setting year");
		}
	System.out.println(year);
	}
	public void setMonth(int month){
		if (month <= 1 && month >= 12){
			throw new IllegalArgumentException("error in setting month");
		}

		System.out.println(month);
	}
	public void setDay(int day){
			
	
	}
	public bool leap(int year){
		if ((year % 4 == 0) || (year % 400 != 0 && year % 100 == 0)){
			return true;
		}
		return false;
	}
	public String toString(){
		return String.format("%02d / %02d / %02d", day, month, year);
	}
	public void setDate(int year, int month, int day){
		setYear(year);
		setMonth(month);
		setDay(day);
		
	}
	
}
