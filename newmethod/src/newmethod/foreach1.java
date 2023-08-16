package newmethod;

import java.util.ArrayList;
import java.util.List;

public class foreach1 {

	public static void main(String[] args) {
		List<String> gameList=new ArrayList<String>();
		gameList.add("football");
		gameList.add("kabadi");
		System.out.println("initialisation");
		gameList.forEach(games->System.out.println(games));

	}

}
