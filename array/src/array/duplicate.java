package array;

public class duplicate {

	public static void main(String[] args) {
		int[] ar= {3,5,4,3,2,2,1};
		System.out.println("duplicate elements are");
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j] && i!=j) {
					System.out.println(ar[i]+"");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
