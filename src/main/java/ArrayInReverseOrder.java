import java.util.Scanner;

public class ArrayInReverseOrder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(printInReverseOrder(arr));
    }
    
	public static String printInReverseOrder(int[] arr) {
		String toPrint = "";
		for (int i = arr.length-1; i >= 0; i--) {
			toPrint += arr[i] + " ";
		}
		return toPrint.substring(0, toPrint.length()-1);
	}

}
