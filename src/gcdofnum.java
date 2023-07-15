
public class gcdofnum {
	static int gcd(int x,int y)
	{
		if(x==0)
			return x;
		if(y==0)
			return y;
		if(x==y)
			return x;
		if(x>y)
			return gcd(x-y,y);
		return gcd(x,y-x);
	}

	public static void main(String[] args) {
		int x=100,y=88;
		gcd(x,y);
		System.out.println("gcd of two num"+gcd(x,y));
		

	}

}
