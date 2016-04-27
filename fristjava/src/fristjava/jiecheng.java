package fristjava;

public class jiecheng {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "2的阶乘为："+jisuan.get(2));
		System.out.println( "4的阶乘为："+jisuan.get(4));
		System.out.println( "6的阶乘为："+jisuan.get(6));
		System.out.println( "10的阶乘为："+jisuan.get(10));

	}

}
class jisuan {
	public static int get(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;// 每循环一次进行乘法运算
		}
		return sum;// 返回阶乘的结果
	}
}
