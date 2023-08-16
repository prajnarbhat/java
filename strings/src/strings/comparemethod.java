package strings;

public class comparemethod {

	public static void main(String[] args) {
		String s1="sach";
		String s2="sach";
		String s3=new String("sach");
		String s4="mach";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("it only checks values inside the string");
		System.out.println("== method");
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println("it checks the refrence");
		System.out.println("compareto method it returns 0,-1,+1");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));

	}

}
