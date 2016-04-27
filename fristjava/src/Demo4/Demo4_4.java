package Demo4;

public class Demo4_4 {
	public static void main(String args[])
	{
		Point2 p=new Point2();
		System.out.println("坐标为："+p.getX()+","+p.getY());
		p.setX(5);
		p.setY(5);
		System.out.print("赋值后的坐标为");
		p.show();
	}
}
class Point2 {
	private int x;
	private int y;
	public Point2()
	{
		this.x=1;
		this.y=1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void show()
	{
		System.out.println(x+","+y);
	}
}