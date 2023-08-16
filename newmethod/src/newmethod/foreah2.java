package newmethod;


import java.util.ArrayList;
import java.util.List;

public class foreah2 {

	public static void main(String[] args) {
		List<String> gameList=new ArrayList<String>();
		gameList.add("cool");
		gameList.add("carrom");
		gameList.forEach(System.out::println);
		

	}

}
