
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LonelyInteger {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 1, 2, 3, 3};
		Set<Integer> setOfInts = new HashSet<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		for (int i : arr) {
			if(setOfInts.add(i)) {
				answer.add(new Integer(i));
			} else {
				answer.remove(new Integer(i));
			}
		}
		
		System.out.println(answer.get(0));
	}

}
