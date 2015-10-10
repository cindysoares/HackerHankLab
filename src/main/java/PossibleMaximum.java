import java.util.Scanner;

public class PossibleMaximum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		for (long i = 0; i < t; i++) {
			long n = s.nextLong();
			long k = s.nextLong();
			System.out.println(possibleMaximun(n, k));
		}
		s.close();
	}

	static long possibleMaximun(long n, long k) {
		return findMaximun(0, n, k, 
				(long j, long s, long e, long x) -> possibleMaximumForEachNumber(j, e, x) );
	}

	static long possibleMaximumForEachNumber(long start, long end, long k) {
		return findMaximun(start, end, k, 
				(long j, long s, long e, long x) -> s&j );
	}

	static long findMaximun(long start, long end, long k, GetValue getValue) {
		long max = 0;
		for (long i = start+1; i <= end; i++) {
			long possibleValue = getValue.done(i, start, end, k);
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
		long done(long i, long start, long end, long k);
	}


}
