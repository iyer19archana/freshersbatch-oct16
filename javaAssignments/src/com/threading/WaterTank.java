package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame {

	int y1=300; int x1=200;
	public WaterTank() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		Thread inlet=new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				for(;y1>=0;)
				{	y1-=10;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
				}
				
			
				
			
				
			}
		});
		
	}
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200,300);
		g.setColor(Color.RED);
		g.fillRect(150, 200, x1, y1);
		g.drawString("70%", 380, 200);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}
}
