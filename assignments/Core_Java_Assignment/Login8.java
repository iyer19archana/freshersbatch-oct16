import java.util.*;
public class Login8
{
	public static void main(String args[])
	{
		int count=1;
		while(count<=3)
		{
			String strname=null;
			System.out.println("Enter Login name");
			
			Scanner sc=new Scanner(System.in);
			try
			{
				strname=sc.nextLine();
			}
			catch(Exception e)
			{}
			String pwd=null;
			System.out.println("Enter Password");
			try
			{
				pwd=sc.nextLine();
			}
			catch(Exception e)
			{}
			
			
			if(strname.equals("archana") && pwd.equals("archana123"))
			{
				System.out.println("Valid");
				break;
			}
			else
			{
				System.out.println("Try Again");
			}
			count++;
		}
		if(count>3)
		{
			System.out.println("Contact Admin");
		}
	
	}
}