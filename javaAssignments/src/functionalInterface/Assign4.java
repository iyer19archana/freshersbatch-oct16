package functionalInterface;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Assign4 {

	public static void main(String[] args) {
		List<String> words=new LinkedList<String>();
		words.add("Hello");
		words.add("Hello1");
		words.add("Hello23");
		
		Predicate<String> p=(String str)->str.length()%2!=0?true:false;
		
		words.removeIf(p);
		
		Iterator<String> itr=words.iterator();
		
		while (itr.hasNext()) {
			String string =itr.next();
			
			System.out.println(string);
		}
		
		
		
	}

}
