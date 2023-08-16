package newmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class studentlist {
	String name;
	int age;
	studentlist(String n,int a)
	{
		this.name=n;
		this.age=a;
	}
	

	public static void main(String[] args) {
		studentlist s1=new studentlist("ravi",6);
		studentlist s2=new studentlist("bavi",90);
		studentlist s3=new studentlist("bas",40);
		ArrayList<studentlist> al=new ArrayList<studentlist>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			studentlist s=(studentlist) it.next();
			System.out.println(s.name+" "+s.age);
		}
		

	}

}
