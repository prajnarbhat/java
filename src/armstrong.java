import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int arm=0;
		Scanner s=new Scanner(System.in);
		System.out.println("input num");
		int n=s.nextInt();
		int tem=n;
		while(n>0)
		{
			int rem=n%10;
			int a=rem*rem*rem;
		    arm=arm+a;
		    n=n/10;
			
		}
		if(arm==tem)
		{
			System.out.println(arm+"yes armsrong num");
			
		}
		else
		{
			System.out.println("not");
		}
		

	}

}
