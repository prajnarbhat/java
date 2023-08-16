package exception;

public class exception2 {

	public static void main(String[] args) {
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("hi");
		}
		catch(Exception e){
			System.out.println("exception is"+e);
			
		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}
