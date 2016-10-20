package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class MyClass{
	private int x;
	
	@Deprecated
	public void print(){
		System.out.println("This is my class");
	}
	
	
	public String returnstring(String abc){
		return "This was returned by middleware";
	}
	
}


class MiddleWare{
	
	public Object  invokemwmethod(String classname , String methodname , Class argtypes[] , Object argvalues[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		Object o;
		Class c = Class.forName(classname);
		Method m = c.getMethod(methodname, argtypes);
		if(m == null){
			o = null;
		}else{
			 o = m.invoke(c.newInstance(), argvalues);
		}
		return o;
	}
	
}



public class ReflectionAssignment {

	
	public static void main(String args[]) throws ClassNotFoundException{
		//Class c = Class.forName("reflection.MyClass");
		//Method m[] = c.getDeclaredMethods();
		/*for(Method method : m){
			System.out.println(method);
		}
		
		Field f[] = c.getDeclaredFields();
		for(Field field : f){
			System.out.println(field);
		}
		*/
		
		
		Class argtypes[] = new Class[1];
		argtypes[0] = String.class;
		
		Object argvalues[] = new Object[1];
		argvalues[0] = "Abc";
		
		MiddleWare mw = new MiddleWare();
		try {
			System.out.println(mw.invokemwmethod("reflection.MyClass", "returnstring", argtypes, argvalues));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
