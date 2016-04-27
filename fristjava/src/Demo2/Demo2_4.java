package Demo2;

public class Demo2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.print("素数为：");
		for ( i = 2; i <= 100; i++)
		{
			for ( j = 2; j <= i - 1; j++)
			{
				if (i % j == 0)
					break;
			}
			if (j >= i)
				System.out.print(i+" ");
		}
	}
}
