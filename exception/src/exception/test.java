package exception;
import java.io.FileInputStream;
public class test {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("d:/abc.txt");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hi");
		
		// TODO Auto-generated method stub

	}

}
