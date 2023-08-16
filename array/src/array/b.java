package array;

public class b {

	public static void main(String[] args) {
		int[] array= {4,3,5,2,1,6};
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("max ele is"+max);
			
			
		}
		
		// TODO Auto-generated method stub

	}

