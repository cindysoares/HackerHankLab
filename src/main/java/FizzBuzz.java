
import java.util.Scanner;


public class FizzBuzz {
	
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			if(i%3 == 0) {
				System.out.print(FIZZ);
				if(i%5 == 0) {
					System.out.println(BUZZ);
				} else {
					System.out.println();
				}
			} else if(i%5 == 0) {
				System.out.println(BUZZ);
			} else {
				System.out.println(i);
			}
		}
		scanner.close();
	}
	
}
