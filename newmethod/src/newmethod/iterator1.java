package newmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("geeks");
		list.add("for");
		Iterator<String> iterator=list.iterator();
		System.out.println(iterator.hasNext());
		iterator.next();
		System.out.println(iterator.hasNext());
		iterator.next();
		System.out.println(iterator.hasNext());

	}

}
