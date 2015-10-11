import java.util.Scanner;

public class MagicalString {
	
	// Magical String => 
	static final StringBuffer S = new StringBuffer("12211212212211211");
	static int lastOutputedIndex = 11;
	
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
		
		long counter = 0;
		for (char character : S.substring(0, n).toCharArray()) {
			if(character == Integer.toString(t).charAt(0)) {
				counter++;
			}
		}
		return counter;
	}

	static char chatAtPositionN(int n) {
		if (n > S.length()) {
			for (int i = lastOutputedIndex+1; S.length() < n; i++) {
				char charAti = S.charAt(i-1);
				char outputChar = '1';
				if(i%2 == 0) {
					outputChar = '2';
				} 
				S.append(outputChar);
				if(charAti == '2') S.append(outputChar);
				lastOutputedIndex++;
			}
		}
		return S.charAt(n-1);
	}

}
