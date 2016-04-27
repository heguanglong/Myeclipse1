package Demo2;

import java.applet.Applet;
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Demo2_2 extends Applet{
   public void paint(Graphics g)
	{
		int i,j,k,n;
		int a=30;
		g.drawString("100~999之间的水仙花数:",15,15);
	    for(n=100;n<=999;n++) 
	    { 
	        i=n/100;/*分解出百位*/ 
	        j=n/10%10;/*分解出十位*/ 
	        k=n%10;/*分解出个位*/ 
	        if(n==i*i*i+j*j*j+k*k*k) 
	        { 
	            g.drawString(String.valueOf(n),a,30);
	            a+=30;
	          
	        } 
	    } 
	}

}
