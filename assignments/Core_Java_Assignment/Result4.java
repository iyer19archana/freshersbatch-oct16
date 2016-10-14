public class Result4
{
	public static void main(String args[])
	{
		
	int sub1=70,sub2=70,sub3=70;
	
	if((sub1>=60)&&(sub2>=60)&&(sub3>=60))
		System.out.println("Result=Passed");
	else if(((sub1>=60)&&(sub2>=60))||((sub2>=60)&&(sub3>=60))||((sub1>=60)&&(sub3>=60)))
		System.out.println("Result=Promoted");
	else //if((sub1||sub2||sub3)>=60||((sub1&&sub2&&sub3)<60))
		System.out.println("Result=Failed");
	}
}