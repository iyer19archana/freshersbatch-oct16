package AnnotationNenum;

enum Status{
	
	NEW(1),REJECTED(2),ACCEPTED(3),COMPLETED(4);
	private int value;
	Status(int val)
	{
		value=val;
	}
	public String toString()
	{
		switch(this)
		{
		case NEW:System.out.println("NEW:"+value);
					break;
		case REJECTED:System.out.println("REJECTED:"+value);
		break;			
		case ACCEPTED:System.out.println("ACCEPTED:"+value);
		break;
		case COMPLETED:System.out.println("Complete:"+value);
		break;
		}
		return null;
		 
	}
	public int getValue()
	{
		return value;
	}
	
}


 class Order {
	
	int orderid;
	int price;
	int quantity;
	public Status status;
	
	
	
	Order(int oi,int price,int quan)
	{
		this.orderid=oi;
		this.price=price;
		this.quantity=quan;
		this.status=Status.NEW;
		
		
	}
	public void printStatus()
	{
		System.out.println(this.status);
	}
 }
	
	public class EnumOrderMain
	{
	public static void main(String[] args) {
	
		Order o=new Order(1, 2000, 4);
		o.printStatus();
	}

}
