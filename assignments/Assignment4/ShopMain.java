abstract class DessertItem
{
	abstract int getCost();
}

class Candy extends DessertItem
{
	public int price;
	public String candyname;
	public int quantity;
	public void add(int price,String name,int q)
	{
		this.price=price;
		this.candyname=name;
		this.quantity=q;
	}
	
	public String toString()
	{
		System.out.println("Name:"+this.candyname+"-Price:"+this.price+"-Quantity:"+this.quantity);
	}
	
	int getCost()
	{
		int rupcost=price*60;
		return rupcost;
	}
	
	int setCost(int c)
	{
		price=c;
	}
	String getCandy()
	{
		return candyname;
	}
	String setCandy(String val)
	{
		candyname=val;
	}
}
class Cookie extends DessertItem
{ 
	public int price;
	public String cookiename;
	public int quantity;
	
	public String toString()
	{
		System.out.println("Name:"+this.cookiename+"-Price:"+this.price+"-Quantity:"+this.quantity);
	}
	public void add(int price,String name,int q)
	{
		this.price=price;
		this.cookiename=name;
		this.quantity=q;
	}
	int getCost()
	{
		int rupcost=price*70;
		return rupcost;
	}
	int setCost(int c)
	{
		price=c;
	}
	String getCookie()
	{
		return cookiename;
	}
	String setCookie(String val)
	{
		cookiename=val;
	}
	
}
class IceCream extends DessertItem
{
	private int price;
	private String flavour;
	public int quantity;
	
	public String toString()
	{
		System.out.println("Name:"+this.flavour+"-Price:"+this.price+"-Quantity:"+this.quantity);
	}
	public void add(int price,String name,int q)
	{
		this.price=price;
		this.flavour=name;
		this.quantity=q;
	}
	int getCost()
	{
		return price;
	}
	int setCost(int c)
	{
		price=c;
	}
	String getIcecream()
	{
		return flavour;
	}
	String setFlavour(String val)
	{
		flavour=val;
	}
}

public class ShopMain
{
	public static void main(String args[])
	{
		ArrayList<Candy>=new ArrayList<Candy>();
		ArrayList<Cookie>=new ArrayList<Cookie>();
		ArrayList<IceCream>=new ArrayList<IceCream>();
		
		/*DessertItem d[]=new DessertItem[6];
		d[0]=new Candy(50,"Ferero",10);
		d[1]=new Candy(100,"Frootz",10);
		d[2]=new Cookie(20,"Goodday",50);
		d[3]=new Cookie(50,"Hide&seek",50);
		d[4]=new IceCream(50,"Mango",20);
		d[5]=new IceCream(100."Chocalate",40);
		*/
		do
		{
			System.out.println("Role Options:");
			System.out.println("1. Owner");
			System.out.println("2.Customer");
			System.out.println("Enter your role");
			Scanner sc=new Scanner(System.in);
			BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
			int role=sc.nextInt();
			
			switch(role)
			{
				case 1: System.out.println("1. Candy    2. Cookie   3.Ice Cream   ");
						System.out.println("Which dessert do you want to update?");
						int ch=sc.nextInt();
						
						switch(ch)
						{
							case 1: Candy c=new Candy();
									System.out.println("Enter candy name");
									String candname=b.readLine();
									System.out.println("Enter candy price");
									try
									{int candprice=sc.nextInt();}
									catch(Exception e){}
									
									
									System.out.println("Enter quantity");
									int candquan=sc.nextInt();
									c.add(candname,candprice,candquan);
									ArrayList<Candy>.add(c);
									
									System.out.println("Inventory status:");
									for(int i=0;i<ArrayList.size;i++)
									{
										System.out.println(c);
									}
									
									break;
									
							case 2: Cookie co=new Cookie();
									System.out.println("Enter cookie name");
									String cookname=b.readLine();
									System.out.println("Enter cookie price");
									try
									{int cookprice=sc.nextInt();}
									catch(Exception e){}
									
									
									System.out.println("Enter quantity");
									int cookquan=sc.nextInt();
									co.add(cookname,cookprice,cookquan);
									ArrayList<Candy>.add(co);
									for(int i=0;i<ArrayList.size;i++)
									{
										System.out.println(co);
									}
						}
			}
		}
	}
}							case 3: 