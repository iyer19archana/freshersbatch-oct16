package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


class Account
{
	private int accno;
	private double bal;
	private String name;
	
	public Account(int accno,double bal,String name)
	{
		this.accno=accno;
		this.bal=bal;
		this.name=name;
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

}

public class DataIOstream {
	
	public static void main(String args[]) throws Exception
	{
	Account[] a=new Account[3];
		a[0]=new Account(11,50000.0,"Raj");
		a[1]=new Account(12,60000.0,"Rahul");
		a[2]=new Account(13,70000.0,"Rohan");

	FileOutputStream fos=new FileOutputStream("D:/freshtraining/freshersbatch-oct16/abcd.txt");
	DataOutputStream dos=new DataOutputStream(fos);
	
	dos.writeInt(a[0].getAccno());
	dos.writeDouble(a[0].getBal());
	dos.writeUTF(a[0].getName());
	
	dos.writeInt(a[1].getAccno());
	dos.writeDouble(a[1].getBal());
	dos.writeUTF(a[1].getName());
	
	dos.writeInt(a[2].getAccno());
	dos.writeDouble(a[2].getBal());
	dos.writeUTF(a[2].getName());
	
	dos.flush();
	fos.flush();
	dos.close();
	fos.close();
	
	FileInputStream fis=new FileInputStream("D:/freshtraining/freshersbatch-oct16/abcd.txt");
	DataInputStream dis=new DataInputStream(fis);
	System.out.println("Details of account 1: ");
	int e=dis.readInt();
	double f=dis.readDouble();
	String g=dis.readUTF();
	System.out.println(e + "-" + f + "-"+g);
	System.out.println("Details of account 2: ");
	int h=dis.readInt();
	double i=dis.readDouble();
	String j=dis.readUTF();
	System.out.println(h + "-" + i + "-"+j);
	System.out.println("Details of account 3: ");
	int k=dis.readInt();
	double l=dis.readDouble();
	String m=dis.readUTF();
	System.out.println(k + "-" + l + "-"+m);
	
	
	
	}

}
