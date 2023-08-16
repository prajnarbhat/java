package javaprograms;

public class argcons {
	int id;
	String n;
	int age;
	argcons(int m,String name){
		id=m;
		n=name;
	}
	argcons(int m,String name,int a){
		id=m;
		n=name;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+n);
		System.out.println(id+" "+n+" "+age);
	}
	

	public static void main(String[] args) {
	argcons s=new argcons(1,"fvf");
	argcons s1=new argcons(2,"dsdd",12);
	s.display();
	s1.display();
	// TODO Auto-generated method stub
	

	}

}
