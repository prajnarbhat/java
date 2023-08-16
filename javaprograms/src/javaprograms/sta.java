package javaprograms;

public class sta {
	String name;
	int id;
	static String coll="dfdf";
	sta(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+""+name+""+coll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sta s1=new sta(1,"fdfd");
		sta s2=new sta(2,"fdfd");
		s1.display();
		s2.display();
		

	}

}
