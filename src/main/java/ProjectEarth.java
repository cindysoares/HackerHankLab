import java.math.BigInteger;
import java.util.Scanner;

public class ProjectEarth {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger n = s.nextBigInteger(), t = s.nextBigInteger();
		System.out.println(reactionTime(n, t));
		s.close();
	}
	
	static BigInteger reactionTime(BigInteger n, BigInteger t) {
		BigInteger seconds = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i=i.add(BigInteger.ONE)) {
			if (seconds.mod(new BigInteger("2"))==BigInteger.ZERO) t=t.add(seconds);
			else t=t.subtract(seconds);
			if(i.mod(new BigInteger("2"))==BigInteger.ZERO) seconds=seconds.add(BigInteger.ONE); 
		}
		return t;
	}

}
