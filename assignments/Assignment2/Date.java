import java.util.*;
public class Date
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
	/*public void swapDate(Date x)
	{
		System.out.println("Date 1:");
		System.out.print(" "+this.day);
		System.out.print(" "+this.month);
		System.out.print(" "+this.year);
		
		System.out.println("Date 2:");
		System.out.print(" "+x.day);
		System.out.print(" "+x.month);
		System.out.print(" "+x.year);
		//System.out.println("Date 2:"+x.day,x.month,x.year);
		Date t1=new Date();
		
		t1.day=this.day;
		this.day=x.day;
		x.day=t1.day;
		
		t1.month=this.month;
		this.month=x.month;
		x.month=t1.month;
		
		t1.month=this.year;
		this.year=x.year;
		x.year=t1.year;
		
		
		System.out.println(" After Swapping");
		System.out.println(" Date 1:");
		System.out.print(" "+this.day);
		System.out.print(" "+this.month);
		System.out.print(" "+this.year);
		
		System.out.println(" Date 2:");
		System.out.print(" "+x.day);
		System.out.print(" "+x.month);
		System.out.print(" "+x.year);
		
		
		
	}*/
	
	public static void swapDate()
	{
		Date t=new Date;
		
		t=arr[0];
		arr[0]=arr[1];
		arr[1]=t;
		
	}
	
	public static void main(String args[])
	{
		Date d1=new Date();
		//d1.setDate(20,2,12);
		d1.getDay();
		d1.getMonth();
		d1.getYear();
		
		
		Date[] arr={{14,7,97},{19,9,94}};
		
		System.out.println("Before Swapping");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		Date.swapDate(d1);
		
		System.out.println("After Swapping");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
		
	
}