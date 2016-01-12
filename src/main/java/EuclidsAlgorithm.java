import java.util.Scanner;

public class EuclidsAlgorithm {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd=find_gcd(a,b);
		System.out.println(gcd);
		sc.close();
	}
	
	public static int find_gcd(int a,int b){
		if(a == b) {
			return a;
		}
		
		int a_ = a>b ? a-b : b-a;
		int b_ = a>b ? b : a;
		return find_gcd(a_, b_);
	}

}
