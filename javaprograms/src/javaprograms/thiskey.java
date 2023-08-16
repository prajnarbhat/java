package javaprograms;

public class thiskey {
	int id;
	String name;
	thiskey(int i,String s){
		this.id=i;
		this.name=s;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskey t=new thiskey(1,"fdf");
		thiskey t1=new thiskey(2,"fdf");
		t.display();
		t1.display();
		

	}

}
