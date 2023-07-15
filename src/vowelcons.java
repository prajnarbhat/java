import java.util.Scanner;

public class vowelcons {

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("input c");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("fiven is vowel");
		}
		else
		{
			System.out.println("constant");
		}
	}

}
