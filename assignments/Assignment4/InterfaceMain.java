interface Printable
{
	public void print();
}

class Circle implements Printable
{
	public void print()
	{
		System.out.println("This is a circle");
	}
}
class Employee implements Printable
{
	public void print()
	{
		System.out.println("This is an Employee");
	}
}

public class InterfaceMain
{
	public static void main(String args[])
	{
		Printable p[]=new Printable[2];
		
		p[0]=new Circle();
		p[1]=new Employee();
		printAll(p);
	}
		static void printAll(Printable[] p)
		{for(int i=0;i<p.length;i++)
		{
			p[i].print();
		}
		}
		
}
