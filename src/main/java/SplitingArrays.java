
public class SplitingArrays {

	public int solution(int X, int[] A) {
		int numberOfXs = 0;
		for (int n : A) {
			if(n==X) numberOfXs++;
		}
		int k = A.length-1;
		int numberOfDifferentsFromX = 0;
		int numberOfEqualsX = 0;
		for (; k>=0 && numberOfDifferentsFromX < (numberOfXs - numberOfEqualsX); k--) {
			int n = A[k];
			if(n==X) {
				numberOfEqualsX ++;
			} else {
				numberOfDifferentsFromX++;
			}
		}
		k++;
		return k;
	}
	
}
