package javaprograms;
class calc{
	void fact(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
		System.out.println(fact);
}
}

public class oops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calc().fact(5);
		

	}

}
