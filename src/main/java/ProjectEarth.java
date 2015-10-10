import java.math.BigInteger;
import java.util.Scanner;

public class ProjectEarth {
	
	private static final BigInteger TWO = new BigInteger("2");

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger n = s.nextBigInteger(), t = s.nextBigInteger();
		System.out.println(reactionTime(n, t));
		s.close();
	}
	
	static BigInteger reactionTime(BigInteger n, BigInteger t) {
		BigInteger seconds = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) < 0; i=i.add(TWO)) {
			if (seconds.mod(TWO)==BigInteger.ZERO) t=t.add(seconds.multiply(TWO));
			else t=t.subtract(seconds.multiply(TWO));
			seconds=seconds.add(BigInteger.ONE); 
		}
		if (n.mod(TWO)!=BigInteger.ZERO) {
			if (seconds.mod(TWO)==BigInteger.ZERO) t=t.add(seconds);
			else t=t.subtract(seconds);
		}
		return t;
	}

}
