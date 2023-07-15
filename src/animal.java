
public class animal {
	public void eat()
	{
		System.out.println("I am eating");
	}
    public static void main(String[] args) {
    	System.out.println("1");
    	animal cat=new animal();
    	cat.eat();
    	cat.run();
    	
    	
    	animal dog=new animal();
    	dog.eat();
    	dog.run();
    	
    	Bird sp=new Bird();
    	sp.fly();
    	
    }
    public void run()
    {
    	System.out.println("I am running");
    }

}

 class Bird {
		void fly()
		{
			System.out.println("i am flying");
		}
		
	}
