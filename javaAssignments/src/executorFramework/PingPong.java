package executorFramework;

import java.util.concurrent.Callable;
//import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PingPong {

	public static void main(String args[])
		{
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Callable<Void> callable1=new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				for(int i=0;i<10;i++)
				{
						System.out.println("PING");
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
			
				return null;
			}
			
			
		};
		Callable<Void> callable2=new Callable<Void>() {
			
			@Override
			public Void call() throws Exception {
				for(int i=0;i<=10;i++)
				{
			System.out.println("\t \t PONG");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
				
				return null;
			}
		};
		
		Future<Void>future1=executor.submit(callable1);
		Future<Void>future2=executor.submit(callable2);
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Runnable runnable1=new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<10;i++)
				{
						System.out.println("PING");
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
			}
		};
		
		Runnable runnable2=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=10;i++)
				{
			System.out.println("\t \t PONG");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
				
			}
		};
			executor.execute(runnable1);
			executor.execute(runnable2);*/

	}

}
