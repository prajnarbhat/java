
public class cmpndintrest {

	public static void main(String[] args) 
	{
		int p=2000,n=12,t=5;
		double r=0.08;
		double amount=p*Math.pow(1+(r/n),n*t);
		double cmp=p-amount;
		System.out.println("compount intrest"+cmp);
		

	}

}
