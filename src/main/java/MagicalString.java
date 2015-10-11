import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicalString {
	
	// Magical String => 
	static final StringBuffer S = new StringBuffer("12211212212211211");
	static final Map<Integer, NumbersOf1And2> counter = new HashMap<Integer, NumbersOf1And2>();
	static int lastOutputedIndex = 11;
	
	static {
		countOcorrencesForMap(1, S.length());
	}

	private static void countOcorrencesForMap(int start, int end) {
		for (int i = start; i <= end; i++) {
			char charAti = S.charAt(i-1);
			NumbersOf1And2 counterOfi = new NumbersOf1And2();
			if(i>1) {
				NumbersOf1And2 counterOfiless1 = counter.get(i-1);
				counterOfi.numberOf1 = counterOfiless1.numberOf1;
				counterOfi.numbersOf2 = counterOfiless1.numbersOf2;
			}
			if(charAti == '1') counterOfi.numberOf1++;
			else counterOfi.numbersOf2++;
			counter.put(i, counterOfi);
		}
	}
	
	static class NumbersOf1And2 {
		private long numberOf1 = 0, numbersOf2 =0;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long q = s.nextInt();
		int t; int n;
		for (long i = 0; i < q; i++) {
			t = s.nextInt(); n = s.nextInt();
			System.out.println(countOccurences(t, n));
		}
		s.close();
	}
	
	static long countOccurences(int t, int n) {
		chatAtPositionN(n);
		
		NumbersOf1And2 counterOfn = counter.get(n);
		return t == 1 ? counterOfn.numberOf1 : counterOfn.numbersOf2;
	}

	static char chatAtPositionN(int n) {
		if (n > S.length()) {
			int iForCounter;
			int i = iForCounter = lastOutputedIndex+1;
			for (; S.length() < n; i++) {
				char charAti = S.charAt(i-1);
				char outputChar = '1';
				if(i%2 == 0) {
					outputChar = '2';
				} 
				S.append(outputChar);
				if(charAti == '2') S.append(outputChar);
				lastOutputedIndex++;
			}
			countOcorrencesForMap(iForCounter, S.length());
		}
		return S.charAt(n-1);
	}

}
