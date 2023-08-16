package newmethod;

public class codepontmeth {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer();
		str.append("geeksforgeeks");
		int unicode=str.codePointAt(10);
		System.out.println(unicode);

	}

}
