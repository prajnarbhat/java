package exception;


public class exception3 {
	void divide() {
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		exception3  x=new exception3();
		try {
		x.divide();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}
