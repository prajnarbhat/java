package javaprograms;

class sup {
	sup(){
		System.out.println("calling constructor");
	}
}
class sup2 extends sup{
	sup2(){
		super();
		System.out.println("clli");
	}
		
	}
class supercons{ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sup2 s=new sup2();
		
		

	}

}
