package pattren;

public class numberpat7 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			int no=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(no);
				no=no+5-j;
			}
			System.out.println();
		}
		

	}

}
