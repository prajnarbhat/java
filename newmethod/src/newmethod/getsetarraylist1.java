package newmethod;

import java.util.ArrayList;

public class getsetarraylist1 {

	public static void main(String[] args) {
		ArrayList<String> lis=new ArrayList<String>();
		lis.add("r");
		lis.add("cat");
		lis.add("dog");
		System.out.println(lis.get(1));
		lis.set(1,"pet");
		Object animal1;
		for(String animal11:lis)
		{
			System.out.println(animal11);
		}
		
		

	}

}
