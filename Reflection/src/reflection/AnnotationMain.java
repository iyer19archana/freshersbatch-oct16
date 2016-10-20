package reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface getter
{
	int rollno() default 5;
	String name() default "";
	String values() default "";
}

class Annot {
	private int rollno;
	private String name;
	
	@getter
	public int getRollno() {
		return rollno;
	}
	
	@getter
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}

public class AnnotationMain
{
	
	public static void main(String args[]) throws ClassNotFoundException{
	Class c=Class.forName("reflection.Annot");
	//Annotation[] a=c.getDeclaredAnnotation(getter);
	Method[] m=c.getDeclaredMethods();
	for(Method method : m )
	 {
		Annotation aa[] = method.getDeclaredAnnotations();
		for (Annotation annotation : aa){
			if(annotation instanceof getter){
				if(method.getReturnType() == void.class){
					System.out.println(method.getName()+" Invalid getter");
				}else{
					System.out.println(method.getName()+" Valid Getter");
				}
			}
		}
	 }
	}
	
}
