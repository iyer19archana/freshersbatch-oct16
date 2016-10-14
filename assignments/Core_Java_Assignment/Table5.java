import java.util.*;
public class Table5
{
	public static void main(String args[])
	{
		System.out.println("Enter any number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(); 
		int i=1;
		while(i<=10)
		{
			System.out.println(num+"X"+i+"="+num*i);
			i++;
		}
	}
}