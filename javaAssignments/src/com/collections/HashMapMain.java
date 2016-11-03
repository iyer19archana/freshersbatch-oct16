package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Date {
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		this.day=12;
		this.month=7;
		this.year=95;
	}
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		return this.day+"-"+this.month+"-"+this.year;
	}
	@Override
	public int hashCode() {
		int ans=day*month;
		return ans;
	}
	@Override
	public boolean equals(Object o) {
		if((this.day==((Date)o).day)&&(this.month==((Date)o).month))
			return true;
		else
			return false;
				
	}
	
}	
public class HashMapMain {
	
	public static void main(String[] args) {
		Date d1=new Date(12,4,1994);
		Date d2=new Date(12,4,1995);
		Map<Date,String> hmap=new HashMap<Date,String>();
		
		hmap.put(d1,"Tom");
		hmap.put(d2, "Jerry");
		
		//System.out.println(hmap.get(d1));
		System.out.println(hmap.get(d2));
		
	}

}
