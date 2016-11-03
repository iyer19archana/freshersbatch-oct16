package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee
{
	private int empid;
	private String name;
	
	public Employee(int id,String name)
	{
		this.empid=id;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return 5;
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	public String toString()
	{
		return this.empid+"-"+this.name;
	}
}
public class HashMapOverride {

	public static void main(String[] args) {
		
		Employee e1=new Employee(111,"Tom");
		Employee e2=new Employee(112,"Jerry");
		Map<Employee,String> hmap=new HashMap<Employee,String>();
		
		hmap.put(e1,"DSouza");
		hmap.put(e2,"Abraham");
		
		
		Iterator<Employee> itr = hmap.keySet().iterator();
		itr = hmap.keySet().iterator();
		
		while(itr.hasNext())
		{
			Employee key = itr.next();
			System.out.println(key + " - " + hmap.get(key));
		}

	}

}
