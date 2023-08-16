package newmethod;

import java.util.ArrayList;

public class arraylist6 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("vijay");
		al1.add("kusuma");
		al1.add("shiva");
		System.out.println("elments are"+al1);
		al1.add(1,"gurav");
		System.out.println("after altering"+al1);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("pankaj");
		al2.add("suma");
		al1.addAll(al2);
		System.out.println("adding al2 to al1");
		System.out.println(al1);
		ArrayList<String> al3=new ArrayList<String>();
		al3.add("samjay");
		al3.add("souraba");
		al1.addAll(al3);
		System.out.println("after adding al1 and al2 to al3");
		System.out.println(al1);
		}

}
