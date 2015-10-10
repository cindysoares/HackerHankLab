import java.util.Scanner;

public class PossibleMaximum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			int k = s.nextInt();
			System.out.println(possibleMaximun(n, k));
		}
		s.close();
	}

	static int possibleMaximun(int n, int k) {
		return findMaximun(0, n, k, 
				(int j, int s, int e, int x) -> possibleMaximumForEachNumber(j, e, x) );
	}

	static int possibleMaximumForEachNumber(int start, int end, int k) {
		return findMaximun(start, end, k, 
				(int j, int s, int e, int x) -> s&j );
	}

	static int findMaximun(int start, int end, int k, GetValue getValue) {
		int max = 0;
		for (int i = start+1; i <= end; i++) {
			int possibleValue = getValue.done(i, start, end, k);
			if(max < possibleValue) {
				max = possibleValue;
			}
			if(max == k-1) {
				return max;
			}
		}
		return max;
	}

	static interface GetValue {
		int done(int i, int start, int end, int k);
	}


}
