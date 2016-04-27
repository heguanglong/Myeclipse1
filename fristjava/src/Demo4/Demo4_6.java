package Demo4;

public class Demo4_6 {
	 public static void main(String args[]) {
       
        Triangle a = new Triangle(3, 4, Math.PI / 2);
       
        Triangle b = new Triangle(1, 1, Math.PI / 3);
        a.show();
        b.show();
        b.changeAng(Math.PI / 2);
        b.show();
    }

}
class Triangle{
	 
    private double x, y, a;
    public Triangle()
    {
    	this.x=0;
    	this.y=0;
    	this.a=0;
    }
 
    public Triangle(double xx, double yy, double aa) {
        x = xx;
        y = yy;
        a = aa;
    }
 
    public double area() {
        return x * y * Math.sin(a) / 2;
    }
 
    public void changeAng(double aa) {
        a = aa;
    }
 
    public void show() {
        System.out.println( "两边长 " + x + " 和 " + y + 
        " ,夹角为 " + a + " 的面积为 " + area());
    }
}