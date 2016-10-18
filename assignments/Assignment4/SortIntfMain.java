interface Sortable
{
	public boolean compare(Sortable s);
}

class Circle implements Sortable
{
	public String toString()
	{
		return " " + this.rad;
	}
	public Circle(int r)
	{
		this.rad=r;
	}
	private int rad;
	
	public boolean compare(Sortable s)
	{
		if(this.rad>((Circle)s).rad)
			return true;
		else
			return false;
	}
}
class Employee implements Sortable
{
	public String toString()
	{
		return " " + empid;
	}
	public Employee(int e)
	{
		this.empid=e;
	}
	private int empid;
	
	public boolean compare(Sortable s)
	{
		if(this.empid>((Employee)s).empid)
			return true;
		else
				return false;
	}
	
}

public class SortIntfMain
{
	public static void main(String args[])
	{
		Sortable s[] =new Sortable[3];
		s[0]=new Circle(7);
		s[1]=new Circle(3);
		s[2]=new Circle(4);
		
		sortAll(s);
		
		Sortable e[] =new Sortable[3];
		e[0]=new Employee(30);
		e[1]=new Employee(20);
		e[2]=new Employee(10);
		
		sortAll(e);
	}
		static void sortAll(Sortable[] s)
		{	Sortable temp;
			for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compare(s[j]))
				{ temp=s[i];
				  s[i]=s[j];
				  s[j]=temp;
					
				}
				
			}
		}
		System.out.println("Sorted array is");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(" "+s[i]);
		}
		}
		
}