package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BallGame extends Frame implements Runnable {

		Thread t1, t2, t3;
		int y1 = 400, y2 = 400, y3 = 400;
		
		
		public BallGame() {
			
			super("Ball game");
			setBackground(Color.CYAN);
			setSize(500, 500);
			setVisible(true);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			t1=new Thread(this);
			t1.setName("RED");
			t2=new Thread(this);
			t2.setName("GREEN");
			t3=new Thread(this);
			t3.setName("BLUE");
			t1.start();
			t2.start();
			t3.start();
			t3.setDaemon(true);
		}
		
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(100, y1, 50, 50);
			g.setColor(Color.GREEN);
			g.fillOval(200, y2, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(300, y3, 50, 50);
		}

	public static void main(String[] args) {
		Frame mf = new BallGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@Override
	public void run() {
		Thread currentthread;
		currentthread=Thread.currentThread();
		int t1=y1;
		while(true)
		{if(currentthread.getName().equals("RED"))
		{ 
			for(;y1>=0;)

		  {
			y1=y1-5; 
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		  }
		
		for(;y1<=400;)

		  {
			y1=y1+5; 
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		  }
		}
		
		
		
		
		else if(currentthread.getName().equals("GREEN"))
			{ for(;y2>=0;)

			  {
				y2=y2-2;
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			  }
			for(;y2<=400;)

			  {
				y2=y2+2; 
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			  }
			}
			
			
			
				if(currentthread.getName().equals("BLUE"))
				{ for(;y3>=0;)

				  {
					y3=y3-3; 
					try {
						Thread.sleep(70);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
				}
				for(;y3<=400;)

				  {
					y3=y3+3; 
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
				  }
				}
			}
	}
			
			
}
	

