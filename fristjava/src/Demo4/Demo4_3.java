package Demo4;

public class Demo4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(6,8);
		System.out.print("第一个复数为：");
		c1.showComp();
		Complex c2=new Complex(5,-8);
		System.out.print("第二个复数为：");
		c2.showComp();
		Complex result1=Complex.add(c1,c2);	
		System.out.print("两复数只和为：");
		result1.showComp();
		Complex result2=Complex.sub(c1,c2);	
		System.out.print("两复数只差为：");
		result2.showComp();

	}

}
class Complex{
	int x,y;
	public int getx()
	{
		return this.x;
	}
	public int gety()
	{
		return this.y;
	}
	Complex(){
		this.x=0;
		this.y=0;
	}
	Complex(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void showComp()
	{
		if(y<0)
		{
		System.out.println(x+""+y+"i");
		}
		else
		{
		System.out.println(x+"+"+y+"i");
		}
	}
	public static Complex add(Complex c1,Complex c2)
	{
		return new Complex(c1.getx()+c2.getx(),c1.gety()+c2.gety());
	}
	public static Complex sub(Complex c1,Complex c2)
	{
		return new Complex(c1.getx()-c2.getx(),c1.gety()-c2.gety());
	}
}
