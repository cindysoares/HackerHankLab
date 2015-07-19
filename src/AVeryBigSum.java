import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;


public class AVeryBigSum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger sum = Stream
			.iterate(scanner.nextBigInteger(), a -> scanner.nextBigInteger())
			.limit(n).reduce(BigInteger.ZERO, (BigInteger a, BigInteger b) -> b.add(a));
		System.out.println(sum);
		scanner.close();
	}

}
