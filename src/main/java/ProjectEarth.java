import java.util.Scanner;

public class ProjectEarth {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), t = s.nextLong();
		System.out.println(reactionTime(n, t));
		s.close();
	}
	
	static long reactionTime(long n, long t) {
		long seconds = 1;
		for (int i = 1; i <= n; i++) {
			t = (seconds%2==0) ? t+seconds : t-seconds;
			if(i%2==0) seconds++; // Passaram mais duas horas, seconds -> incrementa
		}
		return t;
	}

}
