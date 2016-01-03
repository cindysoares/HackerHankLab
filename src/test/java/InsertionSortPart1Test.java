import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortPart1Test {
	
	@Test
	public void testSortingElement() {
		int[] array = new int[] {2,4,6,8,3};
		InsertionSortPart1.insertIntoSorted(array);
		Assert.assertEquals("[2, 3, 4, 6, 8]", Arrays.toString(array));
	}

	@Test
	public void testSortingAnExistingElement() {
		int[] array = new int[] {2,3,4,6,8,3};
		InsertionSortPart1.insertIntoSorted(array);
		Assert.assertEquals("[2, 3, 3, 4, 6, 8]", Arrays.toString(array));
	}

	@Test
	public void testHighestElement() {
		int[] array = new int[] {2,3,4,6,8,9};
		InsertionSortPart1.insertIntoSorted(array);
		Assert.assertEquals("[2, 3, 4, 6, 8, 9]", Arrays.toString(array));
	}

	@Test
	public void testLowerElement() {
		int[] array = new int[] {2,3,4,6,8,1};
		InsertionSortPart1.insertIntoSorted(array);
		Assert.assertEquals("[1, 2, 3, 4, 6, 8]", Arrays.toString(array));
	}

}
