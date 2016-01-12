import java.math.BigInteger;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			long t = s.nextLong();
			System.out.println(convertToBinary(t));
		}
		s.close();
	}

	public static BigInteger convertToBinary(long t) {
		if (t > Math.pow(2, 31)) return null;
		BigInteger result = BigInteger.ZERO;
		long rest = t;
		for (int i = log2(t); i >= 0; i = log2(rest)) {
			BigInteger a = new BigInteger("2").pow(i);
			String binary = "1" + concatZeros(i);
			result = result.add(new BigInteger(binary));
			rest = rest - a.longValue();
			if (rest == 0) break;
		}
		return result;
	}

	public static int log2(long x) {
	    return (int) (Math.log(x) / Math.log(2.0));
	}

	private static String concatZeros(int times) {
		String zeros = "";
		for (int i = 0; i < times; i++) {
			zeros += "0";
		}
		return zeros;
	}



}
