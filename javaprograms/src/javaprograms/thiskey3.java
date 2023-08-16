package javaprograms;

public class thiskey3 {
	int id;
	String name;
	int age;
	thiskey3(int i,String n){
		this.id=i;
		this.name=n;
	}
	thiskey3(int i,String n,int a){
		this(i,n);
		this.age=a;
	}
	void display() {
		System.out.println(id+""+name+""+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskey3 t1=new thiskey3(1,"dede",2);
		t1.display();

	}

}
