package array;

public class commoneleintwoar {

	public static void main(String[] args) {
		int[] array1= {4,3,7,9,2};
		int[] array2= {5,1,4,8,3};
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(+array1[i]);
					break;
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
