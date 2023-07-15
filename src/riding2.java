class test{
	void show()
	{
		System.out.println("1");
	}
}
class riding2 extends test {
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		test t=new test();
		t.show();
		
		riding2 r=new riding2();
		r.show();
	}

}
