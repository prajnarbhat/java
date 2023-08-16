package strings;

public class strinclassmethods {

	public static void main(String[] args) {
		String k="ABCdefGHijk";
		System.out.println(k.toUpperCase());
		System.out.println(k.toLowerCase());
		String t=" opion ";
		System.out.println(t.trim());
		System.out.println(k.startsWith("AB"));
		System.out.println(k.endsWith("jk"));
		System.out.println(k.charAt(0));
		System.out.println(k.length());
		System.out.println(t.length());
		String r="i am prajna";
		String f=r.replace("am","was");
		System.out.println(f);
		

	}

}
