package Demo2;

import java.util.Scanner;

public class Demo2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner san=new Scanner(System.in);
		System.out.print("请输入正整数：");
		int a=san.nextInt();
		if(a>0)
		{
			to2(a);
			to8(a);
			to16(a);
			return;
		}
		else
		{
			System.out.println("请输入正确的正整数！");
			return ;
		}
	}
	private static void to2(int n)
	{
		String a=Integer.toBinaryString(n);
		System.out.println("二进制显示为："+a);
	}
	private static void to8(int n)
	{
		String b=Integer.toOctalString(n);
		System.out.println("八进制显示为："+b);
	}
	private static void to16(int n)
	{
		String c=Integer.toHexString(n);
		System.out.println("十六进制显示为："+c);
	}

}
