import java.util.Scanner;

public class ProjectEarth {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), t = s.nextLong();
		System.out.println(reactionTime(n, t));
		s.close();
	}
	
	enum Pattern {
		FOUR, ONE, TWO, THREE;
	}
	
	static long reactionTime(long n, long t) {
		Pattern pattern = Pattern.values()[(int) (n%4)];
		
		switch (pattern) {
		case ONE:
			return t-1;
		case TWO:
			return t-((n+2)/2);
		case THREE:
			return t;
		case FOUR:
			return t+(n/2);
		default:
			break;
		}
		
		return t;
	}

}
