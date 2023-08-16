package newmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist9 {

	public static void main(String[] args) {
		ArrayList<String> al7=new ArrayList<String>();
		al7.add("vijay");
		al7.add("kusuma");
		al7.add("shiva");
		System.out.println("elments are"+al7);
		ArrayList<String> al8=new ArrayList<String>();
		al8.add("shiva");
		al8.add("suma");
		al7.retainAll(al8);
		System.out.println("same elements"+al7);
		System.out.println("using iterator");
		Iterator i=al7.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		

	}

}
