package Demo2;

public class Demo2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2_6 demo=new Demo2_6();
		int i=1;
		double s=0;
		do{
		s=s+demo.do_get(i);
		i++;
			
		}while(i<20);
		System.out.println("1+1/2!+1/3!+1/4!...的前20项和："+s);

	}
	public double do_get( int n)
	{
		double sum=1;
		for(int i=1;i<=n;i++)
		{
			sum*=i;
		}	
		
		return 1.0/sum;
	}

}
