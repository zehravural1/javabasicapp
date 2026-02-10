package java1.swing;

import java.awt;
import java.awt.Graphics;
import java.awt.applet.Applet;
public class Finall extends Applet {
	
		public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(new Font("Verdana",Font.BOLD,12));
		g.drawArc(20,10,20,20,45,75);
		g.drawArc(50,10,20,20,45,75);

		
		g.setColor(Color.blue);
		g.drawLine(20,1,20,6 );
		g.drawLine(25,1,20,7 );
		g.drawLine(30,1,20,8);
		g.drawLine(35,1,20,8 );
		g.drawLine(40,1,20,9 );
		
		
		
		g.fillOval(25,18,9,9);
		g.fillOval(55,18,9,9);
		
		
		g.setColor(Color.BLACK);
		g.drawArc(37,30,15,50,130,60);
		
		
		
		g.setColor(Color.ORANGE);
		g.drawArc(10,20,50,50,-120,90);
		
		
		
		g.setColor(Color.black);
		g.fillOval(35,80,15,80);
		
		
		
		g.setColor(Color.MAGENTA);
		g.fillRoundRect(1,80,20,100,10,10);
		g.drawRoundRect(20,80,50,125,10,10);
		
		g.fillRoundRect(70,80,20,100,10,10);
		g.fillRoundRect(25,205,18,100,10,10);
		g.fillRoundRect(45,205,18,100,10,10);
		
		
		}
	}
		
		
		
		
		
		
		
		
		
		
		