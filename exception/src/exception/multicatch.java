package exception;
public class multicatch {

	public static void main(String[] args) {
		try {
			int a=args.length;
			System.out.println("a"+a);
			int b=40/a;
			int c[]= {1};
			c[42]=99;
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		catch(Exception e) {
			System.out.println("index out of bound");
		}
		System.out.println("cannot terminate");
	

	}

}
