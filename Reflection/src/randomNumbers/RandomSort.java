package randomNumbers;

import java.util.Random;

public class RandomSort {


public static void main(String[] args) {
    int c;
    int a[]=new int[50];
    int b[]=new int[50];
    Random t = new Random();
 
    for(int i=1;i<=49;i++)
    {
    	a[i]=i;
    }
    // random integers in [0, 100]
 
    for (c = 49; c>= 1; c--) {
      int randomnum=t.nextInt(49);
      int temp=a[c];
      a[c]=randomnum;
      randomnum=temp;
      
    }
    for(int j=1;j<=6;j++)
    {
       for(c=1;c<=6;c++)
    {  
    	   b[j]=a[c];
    }
       //System.out.println(" "+b[j]);
    }
    
    int[] m=new int[6];
    for (int i = 0; i < args.length; i++) {
        m[i] = Integer.parseInt(args[i]);
        }
    
    for(int i=0;i<6;i++)
    {
    	if(m[i]==b[i+1])
    		System.out.println("Matched Value: "+m[i]);
    }
    System.out.println("No matching values");
    		
    }
    
  }


