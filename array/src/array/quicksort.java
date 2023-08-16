package array;

public class quicksort {

	public static void main(String[] args) {
		int[] a= {15,9,7,13,12,16,4,18,11};
		int len=a.length;
		quicksort qs=new quicksort();
		qs.recursion(a, 0,len-1);
		qs.printarray(a);
	}
		int partion(int[] a,int low,int high) {
			int pivot=a[(low+high)/2];
			while(low<=high) {
				while(a[low]<pivot) {
					low++;
				}
				while(a[high]>pivot) {
					high--;
				}
				if(low<=high) {
					int temp=a[low];
					a[low]=a[high];
					a[high]=temp;
					low++;
					high--;
				
				}
			}
			return low;
		}
		void recursion(int[] a,int low,int high) {
			int pi=partion(a,low,high);
			if(low<pi-1) {
				recursion(a,low,pi-1);
			}
			if(pi<high) {
				recursion(a,pi,high);
			}
		}
		void printarray(int[] a) {			
				for(int i:a){
					System.out.println(i+" ");
				}
			}
		}

					
				
			
