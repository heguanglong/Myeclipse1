package fristjava;

class YangHui// 对象调用类名
{
	public  static void main(String args[])
	{
		int[][] s = new int[9][9];// 定义二维数组，因为是n行，所以定义n+1，防止溢出（循环从1开始）
		for (int x = 1; x <= 8; x++)// 此大循环用于控制行数
		{
		  for (int z = 1; z <= 9 - x; z++)
			{
				System.out.print(" ");
			}
			for (int y = 1; y <= x; y++)
			{
				if (y == 1)
				{
					System.out.print(y + " ");
					s[x][y] = 1;
				}
				else if (y == x)// 固定每行最后一个数的值，并赋予二维数组，并打印
				{
				    System.out.print(1 + " ");
					s[x][y] = 1;
				}
				else// 用于打印出除开每行第一个与最后一个的中间数值，并赋予二维数组
				{
					System.out.print(s[x - 1][y - 1] + s[x - 1][y] + " ");
					s[x][y] = s[x - 1][y - 1] + s[x - 1][y];
				}
			}
			System.out.println();// 换行
		}
	}
}