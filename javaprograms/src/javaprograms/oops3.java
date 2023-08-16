package javaprograms;
class stu
{
	int id;
	String name;
    void insert(int r,String s) {
	id=r;
	name=s;
}
void display(){
	System.out.println(id+""+name);
}
}

public class oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu s1=new stu();
		s1.insert(1, "jj");
		s1.display();

	}

}
