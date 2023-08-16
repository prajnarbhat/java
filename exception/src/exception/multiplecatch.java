package exception;

public class multiplecatch {

	public static void main(String[] args) {
		try {
		int a[]=new int[5];
		a[10]=30;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception hanndled");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}
