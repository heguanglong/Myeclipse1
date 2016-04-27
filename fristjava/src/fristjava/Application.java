package fristjava;

import java.applet.Applet;
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Application extends Applet{
	   int a=10;
	public void paint(Graphics g){
		for(int i=1;i<=5;i++) {
		       for(int j=1;j<=2*i-1;j++)
			       g.drawString("* ",a*j,a*i);
		   }
		   }
	

}
