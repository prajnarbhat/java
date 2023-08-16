package exception;

public class nestTry {

	public static void main(String[] args) {
		try {
			int a=2;
			
			System.out.println("a"+a);
			int b=90/a;
			try {
				if(a==1)
					a=a/(a-a);
				if(a==2) {
					int c[]= {1};
				    c[43]=99;
				}
				
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("exception is"+e);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero"+e);
		}
	}
}
		