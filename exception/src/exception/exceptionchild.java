package exception;
import java.io.*;
class parent{
	void msg() {
		System.out.println("parent");
	}
}
public class exceptionchild extends parent{
	void msg() throws ArithmeticException {
		//exception here must be unchecked exception it will show compile time error for checked one
	System.out.println("child");
	}

	public static void main(String[] args) {
		parent p=new exceptionchild();
		p.msg();
		// TODO Auto-generated method stub

	}

}
