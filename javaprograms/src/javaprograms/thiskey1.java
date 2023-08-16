package javaprograms;

public class thiskey1 {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		this.m();
	}

	public static void main(String[] args) {
		thiskey1 t=new thiskey1();
		t.n();
		// TODO Auto-generated method stub

	}

}
