package newmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist5 {

	public static void main(String[] args) {
		ArrayList<String> st=new ArrayList<String>();
		st.add("ravi");
		st.add("saki");
		st.add("sam");
		st.add("pat");
		System.out.println("printing values using iterator");
		ListIterator<String> itr=st.listIterator(st.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println("printiong values using forloop");
		for(String i:st)
		{
			System.out.println(i);
		}
		System.out.println("traversing throug for each");
		st.forEach(a->{System.out.println(a);});
		
	}

}
