package exception;
import java.util.Scanner;
class  YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class throw2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int age=s.nextInt();
		try {
		   if(age<18) {
			    throw new YoungerAgeException("you are not e;igible");
		   }
		   else {
			    System.out.println("you are eligible");
		   }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}