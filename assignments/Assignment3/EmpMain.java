class Employee
{
	private int empno;
	private String name;
	private int sal;
	
	public Employee(int empno,String name,int sal)
	{
		this.empno=empno;
		this.name=name;
		this.sal=sal;
	}
	
	public int getSalary()
	{
		return sal;
	}
}

class Labour extends Employee
{
	private int ot;
	
	public Labour(int empno,String name,int sal,int ot)
	{
		super(empno,name,sal);
		this.ot=ot;
	}
	public int getSalary()
	{
		return super.getSalary()+ot;
	}
}

class Manager extends Employee
{
	private int inc;
	
	public Manager(int empno,String name,int sal,int inc)
	{
		super(empno,name,sal);
		this.inc=inc;
	}
	public int getSalary()
	{
		return super.getSalary()+inc;
	}
}

public class EmpMain
{
	public static void totSal(Employee e[])
	{
		int sum=0;
		for(int i=0;i<e.length;i++)
			{
				sum=sum+e[i].getSalary();
			}
			System.out.println("The total salary of all the employees ="+sum);
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[3];
		e[0]=new Labour(1,"Raj",20000,500);
		e[1]=new Manager(2,"Rahul",50000,5000);
		e[2]=new Employee(3,"abc",30000);
		
		
		totSal(e);
				
	}
}