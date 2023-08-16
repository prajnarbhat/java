
package array;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class dupicateusingmap {

	private static final int Null = 0;

	public static void main(String[] args) {
		int[] array= {3,5,4,3,2,2};
		Map<Integer,Integer> hm=new HashMap<>();
		for(int no:array) {
			int count=hm.get(no);
			if(count==Null) {
				hm.put(no, 1);
				
			}
			else {
				count=count+1;
				hm.put(no, count);
			}
		}
		System.out.println("print duplicate elements");
		Set<Map.Entry<Integer,Integer>>es=hm.entrySet();
		for(Map.Entry<Integer,Integer>me:es)
		{
			if(me.getValue()>1)
			{
				System.out.println(me.getKey()+"");
			}
		}
	}
}