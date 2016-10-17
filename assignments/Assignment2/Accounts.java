public class Accounts{
	
	int ac_no;
	String holder_name;
	float balance;
	
	Accounts(int ac_no,String holder_name,float balance)
	{
		this.ac_no=ac_no;
		this.holder_name=holder_name;
		this.balance=balance;
	}
	
	public void deposit(float val)
	{
		balance+=val;
	}
	
	public void withdraw(float val)
	{
		balance-=val;
	}
	
	public void print_bal()
	{
		System.out.println("Balance=Rs."+this.balance);
	}
	
	public static void main(String args[]){
		
		Accounts a1=new Accounts(111,"Raj",6000);
		
		a1.deposit(500);
		a1.withdraw(1000);
		a1.print_bal();
		
	}
	
}