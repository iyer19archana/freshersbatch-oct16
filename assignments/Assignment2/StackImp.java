public class StackImp
{
	
	private int top=-1;
	private static final int capacity=50;
	int[] arr=new int[capacity];
	public void push(int e)
	{
		if(top<capacity)
		{
			top++;
			arr[top]=e;
			System.out.println("Pushed Element:"+arr[top]);
		}
		else
			System.out.println("Stack Overflow");
		
	}
	
	public void pop()
	{
		if(top>0)
		{
			top--;
			System.out.println("Pop complete");
		}
		else
				System.out.println("Stack underflow");		
	}
	
	public void print()
	{
		System.out.println("Stack elements are");
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		StackImp s1=new StackImp();
		s1.push(10);
		s1.push(20);
		s1.print();
		s1.push(30);
		s1.pop();
		s1.pop();
		s1.print();
	}
}