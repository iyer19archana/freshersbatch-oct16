import java.util.*;
import java.math.*;
public class Armstrong6
{
	public static void main(String args[])
	{
		System.out.println("Enter any number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int temp=num,c=0,a;
	  
    while(num>0)  
    {  
    a=num%10;  
    num=num/10;  
    c=c+(a*a*a);  
    }  
			if(temp==c)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		
		
	}
}