import java.util.*;
class Date
{
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
	
	public void setDate(int day,int month,int year)
	{
		System.out.println("Enter the day");
		Scanner sc=new Scanner(System.in);
		this.day=sc.nextInt();
		
		System.out.println("Enter the month");
		this.month=sc.nextInt();
		
		System.out.println("Enter the year");
		this.year=sc.nextInt();
	}
	public void getDay()
	{
		System.out.println("Day is :"+this.day);
		
	}
	
	public void getMonth()
	{
		System.out.println("Month is :"+this.month);
	}
	
	public void getYear()
	{
		System.out.println("Year is :"+this.year);
	}
	
	public String toString()
	{
		return String.format(this.day+"/"+this.month+"/"+this.year);
	}
	
	public static void swapDate(Date []arr)
	{
		Date t=new Date();
		
		t=arr[0];
		arr[0]=arr[1];
		arr[1]=t;
		
	}
	
}

public class DateMain
{	
	public static void main(String args[])
	{
		Date d1=new Date(20,2,12);
		//d1.setDate(20,2,12);
		d1.getDay();
		d1.getMonth();
		d1.getYear();
		
		Date[] arr=new Date[2];
		arr[0]=new Date(14,7,98);
		arr[1]=new Date(19,9,94);
		
		System.out.println("Before Swapping");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		Date.swapDate(arr);
		
		System.out.println("After Swapping");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
		
	
}