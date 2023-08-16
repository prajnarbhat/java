package newmethod;

public class copymeth {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= new int[a.length];
		a=b;
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		b[0]++;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
