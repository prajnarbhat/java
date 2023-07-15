
public class lcmofnum {

	public static void main(String[] args) {
		int p=72,q=120,lcm;
		lcm=(p>q?p:q);
		while(true)
		{
		if(lcm%p==0 && lcm%q==0)
		{
			System.out.println("lcm is"+lcm);
			break;
		}
		lcm++;
		}
		
		
	}

}
