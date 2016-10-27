package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assign3 {

	public static void main(String[] args) {
		Consumer<Integer> cs=(Integer i)->System.out.println("Square="+i*i);
		cs.accept(6);
		Supplier<Integer> s=()->6*6;
		System.out.println(s.get());
		
		Function<String, Integer> f=(String str)->str.length();
		String s1="Hello";
		System.out.println(f.apply(s1));
		
		Predicate<Integer> p=(Integer a)->a>100;
		System.out.println(p.test(50));
	}

}
