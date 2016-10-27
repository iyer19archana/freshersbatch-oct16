package functionalInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new LinkedList<String>();
		mylist.add("Hello");
		mylist.add("World");
		mylist.add("appy");
		
		Predicate<String> p = (String str)->str.length()%2!=0?true:false;
		
		mylist.removeIf(p);
		
		
		Iterator<String> itr = mylist.iterator();
		
		
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

}
