package exception;

public class methnestTry {
	static void nestTry(int a) {
			try {
			   if(a==1) 
			       a=a/(a-a);
			   if(a==2) {
				   int c[]= {1};
				   c[42]=99;
			   }
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ärray out"+e);
				
			}
		}
		public static void main(String[] args) {
			try {
				int a=2;
				System.out.println(a);
				int b=40/a;

				nestTry(a);
			}
			catch(ArithmeticException e){
				System.out.println("divide by zero");
				
			}
		
		// TODO Auto-generated method stub

	}

}
