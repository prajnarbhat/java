package array;

public class linearsearch2 {

	public static void main(String[] args) {
		String[] a= {"deepak","prakash","sam","lalitha"};
		String item="sam";
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].equals(item)) {
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

		// TODO Auto-generated method stub

	

