package array;
import java.util.Set;
import java.util.HashSet;


public class duplicate2 {

	public static void main(String[] args) {
		int[] ar= {3,5,4,3,4};
	    Set<Integer> S=new HashSet<>();
		for(int no:ar) {
		   if(S.add(no)==false) {
			   System.out.println(no+" ");
		   }
		}
		// TODO Auto-generated method stub

	}

}
