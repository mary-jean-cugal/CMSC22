
import java.lang.*;
public class Date{
	private int year =1000;
	private int month = 1;
	private int day = 1;
	public Date(int year,int month, int day){
		this.day = day;
		this.month = month;
		this.year = year;
		
		
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
		if (this.day <= 1 && day >= 31){
			throw new IllegalArgumentException("error in setting day.");
		}
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