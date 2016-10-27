package functionalInterface;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.function.Consumer;

public class Assign5 {
	
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<String>();
	list.add("Abcg");
	list.add("Rahaj");
	list.add("Catgs");
	list.add("Haanb");
	
	Consumer<ArrayList<String>> cs=(ArrayList<String> alist)->{ 
	
		StringBuilder s1=new StringBuilder("");
		Iterator<String> itr=alist.iterator();
		while (itr.hasNext()) {
			s1.append(itr.next().substring(0, 1));
			
		}
		System.out.println(s1);
		
	
	};
	
	cs.accept(list);
	
	
	
	
	}
	
}

