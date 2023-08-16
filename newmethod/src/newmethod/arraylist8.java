package newmethod;

import java.util.ArrayList;

public class arraylist8 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("vijay");
		al1.add("kusuma");
		al1.add("shiva");
		al1.add("jai");
		System.out.println("elments are"+al1);
		al1.remove("kusuma");
		System.out.println("after that"+al1);
		al1.remove(0);
		System.out.println("o remove"+al1);
		al1.removeAll(al1);
		System.out.println("removing all"+al1);

	}

}
