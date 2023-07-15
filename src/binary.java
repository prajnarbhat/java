
public class binary {

	public static void main(String[] args) {
		int i=0,carry=0;
		int[] arr=new int[10];
		int bin1=1010,bin2=0001;
		while(bin1!=0 && bin2!=0)
		{
			arr[i]=(int)((bin1%10+bin2%10+carry)%2);
			i++;
			carry=(int)((bin1%10+bin2%10+carry)/2);
			bin1=bin1/10;
			bin2=bin2/10;
		}
		if(carry!=0)
		{
			arr[i]=carry;
			i++;
		}
		System.out.println("sum of binary num");
		i--;
	
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}

	}

}
