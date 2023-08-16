package array;

public class duplicate3 {

	public static void main(String[] args) {
		int[] array= {6,5,3,2,5,1,2,4};
		int temp=0;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("first duplicate element"+array[i]);
					temp=temp+1;
					break;
				}
			}
				if(temp>0) {
					break;
				}
					
		}
	}
}
		// TODO Auto-generated method stub

	


