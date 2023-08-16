package exception;
class UnderAgeException extends RuntimeException{
	UnderAgeException(){
		super();
	}
	UnderAgeException(String msg){
		super(msg);
	}
}

public class customexception {
	static void votage(int age) {
	     if(age<18) {
		     throw new UnderAgeException("you are not eligible");
	     }
	     else {
		     System.out.println("eligible");
	     }
	}

	public static void main(String[] args) {
		try {
		votage(13);
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
		System.out.println("hi");
		// TODO Auto-generated method stub

	}

}
