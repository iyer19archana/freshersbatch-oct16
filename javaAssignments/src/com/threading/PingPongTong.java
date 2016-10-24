package com.threading;

public class PingPongTong implements Runnable {

	Thread t1, t2,t3;
	public PingPongTong()
	{
		t2=new Thread(this);
		t1=new Thread(this);
		t3=new Thread(this);
		
	t1.setName("PING");
	t2.setName("PONG");
	t3.setName("TONG");
	t1.start();
	t2.start();
	t3.setDaemon(true);
	t3.start();
	
	}
	@Override
	public void run() {
		Thread currentthread;
		currentthread=Thread.currentThread();
		if(currentthread.getName().equals("PING"))
				{
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
		else if(currentthread.getName().equals("PONG"))
				{for(int i=0;i<10;i++)
				{
			System.out.println("\t PONG");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
		}
		
		else if(currentthread.getName().equals("TONG"))
		{for(int i=0;;i++)
		{
	System.out.println("\t \t TONG");
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
}
		
	}
		public static void main(String args[])
		{
			new PingPongTong();
		}
	
	

}
