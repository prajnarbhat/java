package javaprograms;

public class overload1 {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double d,double e,double f) {
		return (d+e+f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(overload1.add(1, 2));
		System.out.println(overload1.add(1.1,2.,3.4));

	}

}
