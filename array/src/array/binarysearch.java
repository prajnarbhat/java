package array;

public class binarysearch {

	public static void main(String[] args) {
		int[] a= {1,2,4,5,7,8,9};
		int src=8;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(a[mi]==src) {
				System.out.println("elesment is present"+mi);
			}
			else if(a[mi]<src) {
				li=mi+1;
				}
			else {
				hi=mi-1;		
		
			}
	    mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("element not found");
		}
			
		
		// TODO Auto-generated method stub

	}

}
