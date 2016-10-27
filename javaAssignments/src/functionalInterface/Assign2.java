package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Order
{
		
	
	int price;
	String status;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String toString()
	{
		return "Price-"+this.price+"-Status-"+this.status;
	}
	public Order( int price, String status) {
		super();
		
		this.price = price;
		this.status = status;
	}
	
	
}
public class Assign2 {

	List<Order> list=new ArrayList<Order>();
	
	public static List<Order> filter(List<Order> list,Predicate<Order> p)
	{ List<Order> list2=new ArrayList<Order>();
		for(Order o:list)
		{
			if(p.test(o))
				list2.add(o);
		}
		return list2;
		
	}
	
	
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(100000, "COMPLETED"));
		orders.add(new Order(50000, "ACCEPTED"));
		orders.add(new Order(5000, "COMPLETED"));
		orders.add(new Order(7000, "ACCEPTED"));
		
		print(orders);
		Predicate<Order> p=(Order o)->o.getPrice()>10000;
		Predicate<Order> s=(Order o)->o.getStatus().equals("COMPLETED");
		System.out.println("After filterartion by price");
		List<Order> filteredOrdersByPrice = filter(orders, p);
		print(filteredOrdersByPrice);

		System.out.println("After filterartion by status");

		List<Order> filteredOrdersByStatus = filter(orders, s);
		print(filteredOrdersByStatus);
	}


	private static void print(List<Order> filteredOrders) {
		// TODO Auto-generated method stub
		for(Order order : filteredOrders)
			System.out.println(order);
	}

}
