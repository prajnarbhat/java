package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadAndWrite{
	void readFile()throws FileNotFoundException {
		FileInputStream f=new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException {
		FileOutputStream fs=new FileOutputStream("d:/xyz.txt");
	}
}

public class throws1 {

	public static void main(String[] args) {
		ReadAndWrite r=new 	ReadAndWrite();
		try {
		r.readFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		try {
			r.saveFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
