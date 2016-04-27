package Demo2;


public class Demo2_1 {
	public static void main(String args[]){
		System.out.print("1900之间的润年为：");
		for(int i=1900;i<=2000;i++)
		{
			
			if(i%4==0&&i%100!=0||i%400==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
