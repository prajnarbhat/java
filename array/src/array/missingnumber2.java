package array;

public class missingnumber2 {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,6};
		int XOR1=array[0];
		for(int i=1;i<array.length;i++) {
			XOR1=XOR1^array[i];
		}
		int XOR2=1;
		for(int i=2;i<=array.length+1;i++) {
			XOR2=XOR2^i;
		}
		System.out.println(+XOR1^XOR2);	
		// TODO Auto-generated method stub

	}

}
