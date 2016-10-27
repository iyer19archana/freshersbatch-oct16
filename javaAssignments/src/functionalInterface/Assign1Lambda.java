package functionalInterface;


@FunctionalInterface
interface MyFuncInterface<T>
{
	double calc(int a,int b);
	
}
public class Assign1Lambda {
public static void main(String[] args) {
		
	MyFuncInterface<Integer> mfiSum=(int a,int b)->{return a+b;};
	MyFuncInterface<Integer> mfiSub=(int a,int b)->{return a-b;};
	MyFuncInterface<Integer> mfiProd=(int a,int b)->{return a*b;};
	MyFuncInterface<Double> mfiDiv=(int a,int b)->{return a/b;};
	
	System.out.println("Sum="+mfiSum.calc(5, 8));
	System.out.println("Diff="+mfiSub.calc(9, 5));
	System.out.println("Product="+mfiProd.calc(4, 5));
	System.out.println("Quotient="+mfiDiv.calc(50, 11));
	}

}
