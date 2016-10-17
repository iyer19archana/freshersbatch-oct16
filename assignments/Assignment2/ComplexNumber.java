public class ComplexNumber
{
	private double real;
	private double img;
	
	ComplexNumber()
	{
		this.real=4;
		this.img=5;
	}
	
	ComplexNumber(double real,double img)
	{
		this.real=real;
		this.img=img;
	}
	
	public void add(ComplexNumber c)
	{
		ComplexNumber a=new ComplexNumber(6,7);
		a.real=c.real+this.real;
		a.img=c.img+this.img;
		
		System.out.print(" Sum= ");
		System.out.println(a.real+" "+a.img+"i");
	}
	
	public void sub(ComplexNumber c)
	{
		ComplexNumber a=new ComplexNumber(2,3);
		a.real=this.real-c.real;
		a.img=this.img-c.img;
		
		System.out.print(" Diff= ");
		System.out.println(a.real+"+"+a.img+"i");
	}
	
	public void mul(ComplexNumber c)
	{
		ComplexNumber a=new ComplexNumber(6,7);
		a.real=(this.real*c.real)-(this.img*c.img);
		a.img=(this.img*c.real)+(this.real*c.img);
		
		System.out.print(" Product= ");
		System.out.println(a.real+" "+a.img+"i");
	}
	
	
	public static void main(String args[])
	{
		ComplexNumber c1=new ComplexNumber(6,4);
		ComplexNumber c2=new ComplexNumber(2,3);
		
		c1.add(c2);
		c1.sub(c2);
		c1.mul(c2);
		
	}	
		
}
