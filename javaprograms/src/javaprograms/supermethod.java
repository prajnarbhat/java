package javaprograms;
class super10{
	void eat() {
		System.out.println("eating");
	}
}
class super4 extends super10{
	void bark() {
		System.out.println("barking.....");
	}
	void eat() {
		System.out.println("eat of chils");
	}
	void tea() {
		System.out.println("tra");
		super.eat();
		bark();
		eat();
	}
}

public class supermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super4 s=new super4();
		s.tea();
		

	}

}
