package javaprograms;

class test1 {
	static String c="sdsd";
	String name;
	int id;
	static void change() {
		c="fgfgfg";
	}
	test1(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name+" "+c);
	}
}
class static2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1.change();
		test1 s=new test1(1,"sdsfsf");
		test1 s1=new test1(2,"sd");
		s.display();
		s1.display();
		
		

	}
}

