import java.util.Scanner;

public class neonnum {

	public static void main(String[] args) {
		double sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int sq=a*a;
		while(sq>0)
		{
			double r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		if(sum==a)
		{
			System.out.println("neon num");
		}
		else
		{
			System.out.println("not");
		}
		

	}

}
