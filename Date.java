

import java.lang.*;
public class Date{
	private int year;
	private int month;
	private int day;
	public Date(){
		this.year = 1000;
		this.month = 1;
		this.day = 1;
	}
	public Date(int year,int month, int day){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getYear(){	
		return year;
	}
	public int getMonth(){
		if (month < 0 && month > 13){
			throw IllegalArgumentException("month entered is either too small or too big");
		return month;
	}
	public int getDay(){
		if ((month % 4 == 0) || (month % 100 == 0 && month % 400 == 0)) {
			if (month == 2) {
				if (day < 1 || day > 29) {
					throw new IllegalArgumentException("day is early too short or too late!");
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					throw new IllegalArgumentException("day is early too short or too late!");
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || 
				month == 8 || month == 10 || month == 12) {
				if (day < 1 || day > 31) {
					throw new IllegalArgumentException("day is early too short or too late!");
				}
			}
		} else {
			if (month == 2) {
				if (day < 1 || day > 28) {
					throw new IllegalArgumentException("day is early too short or too late!");
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					throw new IllegalArgumentException("day is early too short or too late!");
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || 
				month == 8 || month == 10 || month == 12) {
				if (day < 1 || day > 31) {
					throw new IllegalArgumentException("day is early too short or too late!");
				}
			}
		}
		this.day = day;
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
		if (this.day > 1 && day < 31){
	    throw new IllegalArgumentException("error in setting");
			
		}else if (month == 2 || (month % 400 && month % 4 == 0 ))
		System.out.println(day);
	}
	public String toString(){
		return String.format("%02d / %02d / %02d", day, month, year);
	}
	public void setDate(int year, int month, int day){
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
}
