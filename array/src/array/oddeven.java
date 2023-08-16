package array;
import java.util.ArrayList;
public class oddeven {

	public static void main(String[] args) {
		int[] array= {8,5,10,12,3,1,4};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				al1.add(array[i]);
			}
			else {
				al2.add(array[i]);
			}
		}
		
		System.out.println("print even numbers");
		int total=0;
		
	
		for(int no:al1) {
			System.out.println(no+"");
			total=total+no;
		}
		
		    System.out.println("\n");
			System.out.println("sum of even numbers"+total+" ");
			System.out.println("number of even numbers"+al1.size());
		
		int total1=0;
		System.out.println("print odd numbers");{
		
		for(int no:al2) {
			
			System.out.println(no+"");
			total1=total1+no;
		}
		    System.out.println("\n");
			System.out.println("sum of odd numbers"+total1+"");
			System.out.println("number of odd numbers"+al2.size());
		}
	}
}
	

	
		
		// TODO Auto-generated method stub

	


