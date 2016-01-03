import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double M = sc.nextDouble(); // original meal price
		int T = sc.nextInt(); // tip percentage
		int X = sc.nextInt(); // tax percentage

		double tip = (M*T)/100;
		double tax = (M*X)/100;
		double account = M + tip + tax;

		int total = (int) Math.round(account);

		System.out.println("The final price of the meal is $" + total + ".");
		sc.close();
	}
}
