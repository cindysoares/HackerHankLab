import java.util.Scanner;

public class HourGlasses2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(findTheLargestSum(arr));
        in.close();
    }

	public static int findTheLargestSum(int[][] input) {
		int lenght = input.length;
		int greatestSum = -63;
		for (int i = 1; i < lenght - 1; i++) {
			for (int j = 1; j < lenght - 1; j++) {
				int hourGlassSum = input[i-1][j-1] + input[i-1][j] + input[i-1][j+1] +
													 input[i][j] + 
								   input[i+1][j-1] + input[i+1][j] + input[i+1][j+1];
				if(greatestSum < hourGlassSum) {
					greatestSum = hourGlassSum;
				}
			}			
		}
		return greatestSum;
	}
    
}
