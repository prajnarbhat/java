package array;
import java.util.HashSet;

public class commonelementsintwoar2 {

	public static void main(String[] args) {
		int[] array1= {4,3,7,9,2,4};
		int[] array2= {5,1,4,8,3};
		HashSet<Integer> hs=new HashSet<>();
		for(int no:array1) {
			hs.add(no);
		}
		for(int no:array2) {
			boolean b=hs.add(no);
			if(b==false) {
				System.out.println(+no);
			}
		}

		// TODO Auto-generated method stub

	}

}
