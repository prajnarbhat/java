package newmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("pru");
		list.add("pa");
		list.add("ra");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
