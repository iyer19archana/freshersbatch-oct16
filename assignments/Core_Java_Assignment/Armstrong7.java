import java.util.*;
import java.math.*;
public class Armstrong7
{
	public static void main(String args[])
	{
		
		int temp,c=0,b;
		
		System.out.println("Armstrong Numbers between 100 and 999 are:");
		for(int i=100;i<=999;i++) 
	 { temp=i;
    while(temp!=0)  
    {  
    b=temp%10;  
    temp=temp/10;  
    c=c+(b*b*b);  
    }  
			if(c==i)
			{
				System.out.print(i+" ");
			}
				c=0;
	 }	 
	}
}