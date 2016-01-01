import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Pontes de Königsberg
public class TheCabalisticHills {
	
	private static final String SUCCESS_MESSAGE = "Go on get the Magical Lamp";
	private static final String ERROR_MESSAGE = "Danger!! Lucifer will trap you";
	
	static class Hill {
		int v;
		List<Hill> bridgesToV = new LinkedList<Hill>();
		public Hill(int v) {
			this.v = v;
		}
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Hill)) return false; 
			return v == ((Hill)obj).v;
		}
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt(); long m = s.nextLong();
			Hill[] hills = new Hill[n];
			for (int j = 0; j < m; j++) {
				int v1 = s.nextInt(), v2 = s.nextInt();
				Hill h1 = hills[v1-1];
				Hill h2 = hills[v2-1];
				if(h1==null) {
					h1 = new Hill(v1);
					hills[v1-1] = h1;
				}
				if(h2==null) {
					h2 = new Hill(v2);
					hills[v2-1] = h2;
				}
				h1.bridgesToV.add(h2);
				h2.bridgesToV.add(h1);
								
			}
			if(passThroughAllHills(hills)) System.out.println(SUCCESS_MESSAGE);
			else System.out.println(ERROR_MESSAGE);
			
		}
		s.close();
	}
	
	static boolean passThroughAllHills(Hill[] hills) {
		boolean haveOddNumbersOfBridges = false;
		int numberHillsWithOddNumbersOfBridge = 0;
		for (Hill hill : hills) {				
			if (hill == null || hill.bridgesToV.size()%2!=0 || hill.bridgesToV.size() == 0) {
				haveOddNumbersOfBridges = true;
				numberHillsWithOddNumbersOfBridge ++;
			}
		}
		
		if (haveOddNumbersOfBridges && numberHillsWithOddNumbersOfBridge!=2) {
			return false;
		}
		
		Hill firstHill = hills[0];
		hills[0] = null;
		if(firstHill==null) {
			return false;
		}
		
		Hill firstBridgeTo = firstHill.bridgesToV.get(0);
		Hill lastHill = walkThroughTheBrigdes(firstHill, firstBridgeTo, hills);
		
		if(lastHill==firstHill) return true;
		else return false;
	}
	
	static Hill walkThroughTheBrigdes(Hill hill1, Hill hill2, Hill[] hillsToPass) {
		hill1.bridgesToV.remove(hill2);
		hill2.bridgesToV.remove(hill1);
		
		if(hill2.bridgesToV.isEmpty()) return hill2;
		Hill nextHill = null;
		for (Hill hill : hill2.bridgesToV) {
			if(hill != null && hillsToPass[hill.v-1] != null) {
				hillsToPass[hill.v-1] = null;
				nextHill=hill;
				break;
			}
			nextHill = hill;
		}
		if(nextHill == null) return null;
		
		return walkThroughTheBrigdes(hill2, nextHill, hillsToPass);		
		
	}

}
