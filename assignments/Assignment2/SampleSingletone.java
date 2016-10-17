public class SampleSingletone {
private static SampleSingletone ref = null;
private SampleSingletone() { }
public static SampleSingletone getInstance() {
if(ref == null)
ref = new SampleSingletone();
return ref;
}
public static void main(String args[])
{
	SampleSingletone s1=new SampleSingletone();
	
	//System.out.println(s1.getInstance());
	
	//SampleSingletone s2=new SampleSingletone();
	
	System.out.println(s1);
}
}

