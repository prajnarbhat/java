package array;

import java.util.HashSet;

public class firstduplicate2 {

	public static void main(String[] args) {
		int[] array= {6,5,3,2,5,1,2,4,5};
		int temp=-1;
		HashSet<Integer> hs=new HashSet<>();
		for(int i=array.length-1;i>=0;i--) {
			if(hs.contains(array[i])) {
				temp=i;
			}
			else {
				hs.add(array[i]);
			}
		}
		if(temp!=-1) {
			System.out.println("first duplicate element"+array[temp]);
		}
		else {
			System.out.println("no duplicate elements");
		
			
		}
		
		// TODO Auto-generated method stub

	}

}
