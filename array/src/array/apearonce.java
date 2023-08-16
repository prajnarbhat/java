package array;

public class apearonce {

	public static void main(String[] args) {
		int array[]= {5,3,4,5,2,3,4};
		int res=array[0];
		for(int i=1;i<array.length;i++) {
			res=res^array[i];
		}
		System.out.println("single element is"+res);
		// TODO Auto-generated method stub

	}

}
