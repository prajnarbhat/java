class a{
	void Showa()
	{
		System.out.println("a class method");
	}
}
class inheritb extends a{
	void Showinheritb()
	{
		System.out.println("b class method");
	}
	public static void main(String[] args) {
		a ob1=new a();
		ob1.Showa();
		
		inheritb ob2=new inheritb();
		ob2.Showinheritb();
		ob2.Showa();
		// TODO Auto-generated method stub

	}

}
