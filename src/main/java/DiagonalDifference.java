
import java.util.Scanner;


public class DiagonalDifference {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sumD1 = 0, sumD2 = 0;
		for (int i =0 ; i<n; i++) {
			for (int j = 0; j < n; j++) {
				int a = scanner.nextInt();
				if (i==j) {
					sumD1 += a; //matriz[i][i];
				}				
				if (i==(n-j-1)) {
					sumD2 += a; // matriz[i][n-i-1];
				} 
			}
		}
		
		System.out.println(Math.abs(sumD1-sumD2));
		scanner.close();		
	}
		
}
