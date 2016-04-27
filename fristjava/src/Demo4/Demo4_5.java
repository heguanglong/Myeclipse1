package Demo4;

public class Demo4_5 {
	 public static void main(String args[]) {
       
        Triangle1 a = new Triangle1(3, 4, Math.PI / 2);
        a.show();
        a.changeAng(Math.PI / 3);
        System.out.print("修改角度后的：");
        a.show();
    }

}
class Triangle1{
	 
    private double x, y, a;
 
    public Triangle1(double xx, double yy, double aa) {
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