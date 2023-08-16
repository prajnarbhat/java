package array;

public class linearsearch {

	public static void main(String[] args) {
		int[] a= {5,3,6,1,4,2};
		int item=3;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==item) {
				System.out.println("element is found"+i);
				temp=temp+1;
			}
	if(temp==0) {
	     System.out.println("element noy found");
			}
		}
		// TODO Auto-generated method stub

	}

}
