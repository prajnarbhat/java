package array;

public class kthlargest {

	public static void main(String[] args) {
		int[] arr= {5,8,12,7,6,2,4,3};
		int k=4;
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
				if(i==k-1) {
					System.out.println("largest ele"+arr[i]);
					break;
			}
				// TODO Auto-generated method stub

	}

}
}
