package exception;

public class nestTry1 {

	public static void main(String[] args) {
		try {
			try {
				int a=39/0;
				System.out.println(a);
			}
			catch(ArithmeticException e) {
				System.out.println("divide by zero");
			}
			try {
				int a[]=new int[10];
				a[5]=10;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
