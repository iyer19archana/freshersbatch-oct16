class Account
{
	private int accno;
	private int bal;
	
	public Account(int accno,int bal)
	{
		this.accno=accno;
		this.bal=bal;
	}
	
	public int getBalance()
	{
		return bal;
	}
}

class Savings extends Account
{
	private int fd;
	
	public Savings(int accno,int bal,int fd)
	{
		super(accno,bal);
		this.fd=fd;
	}
	public int getBalance()
	{
		return super.getBalance()+fd;
	}
}

class Current extends Account
{
	private int cc;
	
	public Current(int accno,int bal,int cc)
	{
		super(accno,bal);
		this.cc=cc;
	}
	public int getBalance()
	{
		return super.getBalance()+cc;
	}
}

public class AccountMain
{
	public static void totBal(Account a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i].getBalance();
			}
			System.out.println("The total cash in the bank ="+sum);
	}
	public static void main(String args[])
	{
		Account a[]=new Account[2];
		a[0]=new Savings(1234,20000,500);
		a[1]=new Current(3432,50000,5000);
		
		
		totBal(a);
				
	}
}