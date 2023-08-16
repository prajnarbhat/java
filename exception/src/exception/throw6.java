package exception;

public class throw6 {
	void s() {
		throw new ArithmeticException("divide zer");
	}
	void n()  {
		s();
	}
	void m() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		throw6 t=new throw6();
		t.m();
		// TODO Auto-generated method stub

	}

}
