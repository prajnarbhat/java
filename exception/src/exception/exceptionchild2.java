package exception;
class parents{
	void msg() throws Exception{
		System.out.println("parents");
	}
}

public class exceptionchild2 extends parents{
	void msg() throws ArithmeticException{
		//if we extend the superclass which has exception then exception thrown in child class must be subclass or same exception as above
		System.out.println("children");
	}

	public static void main(String[] args) {
		exceptionchild2 p=new exceptionchild2();
		try {
		p.msg();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
