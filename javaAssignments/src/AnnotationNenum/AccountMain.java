package AnnotationNenum;
class InsufficientBalanceException extends Exception
{
	public String message;
	public InsufficientBalanceException()
	{this.message="";}
	public InsufficientBalanceException(String message)
	{this.message=message;}
	
	public String toString()
	{
		return "Entered amount greater than account balance. Cannot withdraw."+this.message;
	}
}

class Account
{
	private int accno;
	private int bal;
	
	public Account(int accno,int bal)
	{
		this.accno=accno;
		this.bal=bal;
	}
	public void withDraw(int amt) throws InsufficientBalanceException
	{
		
		if(amt>bal)
			throw new InsufficientBalanceException("Invalid Amount:"+amt);
		else
		bal-=amt;
		System.out.println("Amount withdrawn. Current Balance="+bal);
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
	public static void main(String args[]) throws InsufficientBalanceException
	{
		Account a[]=new Account[2];
		a[0]=new Savings(1234,20000,500);
		a[1]=new Current(3432,50000,5000);
		try
		{
		  a[0].withDraw(200);
		  a[1].withDraw(60000);
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
		//totBal(a);
				
	}
}

