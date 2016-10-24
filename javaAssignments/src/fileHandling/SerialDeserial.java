package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class AccountMain implements Serializable
{
	private int accno;
	private double bal;
	private String name;
	public Date dob;
	
	private static final long serialVersionUID = 1L;

	
	public AccountMain(int accno,double bal,String name,Date date)
	{
		this.accno=accno;
		this.bal=bal;
		this.name=name;
		this.dob=date;
	}


public int getAccno() {
		return accno;
	}



	public void setAccno(int accno) {
		this.accno = accno;
	}



	public double getBal() {
		return bal;
	}



	public void setBal(double bal) {
		this.bal = bal;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Account: "+this.accno + "Balance: " +this.bal + "Name:" +this.name + "Date of Birth"+ this.dob; 
		
	}

}

public class SerialDeserial
{
	public static void main(String[] args) throws Exception {
	
		File file=new File("D:/freshtraining/freshersbatch-oct16/serial.txt");
		FileOutputStream f1=new FileOutputStream(file);
		ObjectOutputStream obj1=new ObjectOutputStream(f1);
		
		obj1.writeObject(new AccountMain(11,50000.0,"Raj",new Date(2,4,2014)));
		
		//ObjectOutputStream obj1=new ObjectOutputStream(f1);
		obj1.writeObject(new AccountMain(12,60000.0,"Rahul",new Date(3,7,2012)));
		//ObjectOutputStream obj1=new ObjectOutputStream(f1);
		obj1.writeObject(new AccountMain(13,70000.0,"Rohan",new Date(22,5,2013)));
		
		obj1.flush();
		obj1.close();
		/*obj2.flush();
		obj2.close();
		obj3.flush();
		obj3.close();
		*/
		FileInputStream f2=new FileInputStream(file);
		ObjectInputStream obj2=new ObjectInputStream(f2);
		
		AccountMain account=(AccountMain)obj2.readObject();
		System.out.println(account);
		
		
		
	}

}
