
public class fibonacii {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		int sum=0;
		System.out.println("print n1 and n2"+n1+""+n2);
		
		for(int i=1;i<10;i++)
		{
		n3=n1+n2;
		System.out.println(+n3);
		if(n3%2==0)
		{
		
			sum=sum+n3;
		}
		n1=n2;
		n2=n3;

		}
		System.out.println("sum of fib series"+sum);
		
		
	}

}
