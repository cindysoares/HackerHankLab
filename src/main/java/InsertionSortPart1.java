import java.util.Scanner;

public class InsertionSortPart1 {
	public static void insertIntoSorted(int[] ar) {
		int e = ar[ar.length-1];
		for (int j=ar.length-2; j>=0 ; j--) {
			int a = ar[j];
			if(e<a) {
				ar[j+1] = a;	
				printArray(ar);
				if(j == 0) {
					ar[j] = e;
					printArray(ar);
				}
			} else {
				ar[j+1] = e;
				printArray(ar);
				break;
			}			
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertIntoSorted(ar);
	}


	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}


}
