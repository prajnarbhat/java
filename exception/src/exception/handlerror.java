package exception;
import java.util.Random;
public class handlerror {

	public static void main(String[] args) {
		int a=0,b,c;
		Random r=new Random();
		for(int i=0;i<10;i++)
		try {
			b=r.nextInt();
			c=r.nextInt();
			a=12/(b/c);
			
		}
		catch(Exception e) {
			System.out.println("divsion by zer"+e);
			a=0;

		}
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
