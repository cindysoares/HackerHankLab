import java.util.Scanner;

public class Staircase {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
