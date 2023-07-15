
public class animals {
	String colours;
	int age;
	public static void main(String[] args) {
		animals buzo=new animals();
		buzo.colours="Black";
		buzo.age=12;
		System.out.println(buzo.colours+" "+buzo.age);
		// TODO Auto-generated method stub
		
		anima cat = new anima();
		cat.intobj("black",10);
		cat.display();

	}

}


class anima{
	String color;
	int age;
	void intobj(String c,int a)
	{
		color=c;
		age=a;
	}
	void display()
	{
		System.out.println(color+" "+age);
		
	}
	
}