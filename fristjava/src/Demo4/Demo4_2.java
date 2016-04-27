package Demo4;

public class Demo4_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Point point1=new Point(2, 3);
          System.out.print("第一个点：");
          point1.show();
          Point point2=new Point(4, 6);
          System.out.print("第二个点：");
          point2.show();
          Point point=Point.getMidle(point1, point2);
          System.out.print("中点：");
          point.show();
        
	}
}
class Point{
	double x;
	double y;
	public Point(double x,double y){
		this.x=x;
		this.y=y;	
	}	
	public Point()
	{
		
	}
    public static Point getMidle(Point point1,Point point2)
    {
    		double a,b;
    		a=(point1.x+point2.x)/2;
    		b=(point1.y+point2.y)/2;
    		Point p=new Point(a,b);
    		return p;
    		
    }
    public void show(){
    	System.out.println(x+", "+y);
    }
        
}