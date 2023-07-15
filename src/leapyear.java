
public class leapyear {

	public static void main(String[] args) {
		int year=1996;
		boolean leap=true;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
			        leap=true;	
				}
				else
				{
					leap=false;
				}
			}
			else
			{
				leap=true;
			}
		}
		else
		{
			leap=false;
		}
		if(leap==true)
		{
			System.out.println("yes it is leap year");
		}

	}

}
