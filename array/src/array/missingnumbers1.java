package array;

public class missingnumbers1 {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,6};
		int expectedlength=array.length+1;
		int total_sum=(expectedlength*(expectedlength+1))/2;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		int result=total_sum-sum;
		System.out.println("missing element"+result);
		// TODO Auto-generated method stub

	}

}
