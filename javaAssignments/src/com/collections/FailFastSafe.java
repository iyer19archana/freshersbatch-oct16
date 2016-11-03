package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSafe {
	
	static List<Integer> list=new ArrayList<Integer>();
	static ListIterator<Integer> itr=list.listIterator();

	
	public FailFastSafe()
	{
	
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			while(itr.hasNext())
			{
				
				System.out.println(itr.next());
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
	
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			while(itr.hasNext())
			{
				itr.add(5);
			}
			
		}
	});
	
	t1.start();
	t2.start();
	
	}
	
	public static void main(String[] args) {
		
		FailFastSafe obj=new FailFastSafe();
		
		itr.add(1);
		itr.add(2);
		itr.add(3);
		
		
		
}
}