
public class riding {
	void show(String a,int b)
	{
		System.out.println("1");
	}
	void show(int a,String b)
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		riding t=new riding();
		t.show(10,"book");
	}

}
