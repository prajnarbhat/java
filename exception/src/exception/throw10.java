package exception;

public class throw10 {
	 void vote(int age) {
		if (age<18) {
			throw new ArithmeticException();
		}
		else
			System.out.println("eligible");
	}

	public static void main(String[] args) {
		throw10 t=new throw10();
		try {
		t.vote(13);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}
