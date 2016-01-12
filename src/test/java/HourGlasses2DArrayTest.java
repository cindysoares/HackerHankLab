import org.junit.Assert;
import org.junit.Test;

public class HourGlasses2DArrayTest {
	
	@Test
	public void testHourGlassWithTheLargestSum() {
		int[][] input = new int[][] {
			{1,1,1,0,0,0},
			{0,1,0,0,0,0},
			{1,1,1,0,0,0},
			{0,0,2,4,4,0},
			{0,0,0,2,0,0},
			{0,0,1,2,4,0},
		};
		Assert.assertEquals(19, HourGlasses2DArray.findTheLargestSum(input));
	}
	
	@Test
	public void testHourGlassWithTheLargestSumOnTheLastPosition() {
		int[][] input = new int[][] {
			{1,1,1,0,0,0},
			{0,1,0,0,0,0},
			{1,1,1,0,0,0},
			{0,0,0,2,4,4},
			{0,0,0,0,2,0},
			{0,0,0,1,2,4},
		};
		Assert.assertEquals(19, HourGlasses2DArray.findTheLargestSum(input));
	}

	@Test
	public void testHourGlassWithTheLargestSumOnTheFirstPosition() {
		int[][] input = new int[][] {
			{2,4,4,0,0,0},
			{0,2,0,0,0,0},
			{1,2,4,0,0,0},
			{0,0,0,1,1,1},
			{0,0,0,0,2,0},
			{0,0,0,1,2,4},
		};
		Assert.assertEquals(19, HourGlasses2DArray.findTheLargestSum(input));
	}

	@Test
	public void testHourGlassWithTheLargestSumOnTheFirstPositionOfLastLine() {
		int[][] input = new int[][] {
			{1,1,1,0,0,0},
			{0,1,0,0,0,0},
			{1,1,1,0,0,0},
			{2,4,4,1,1,1},
			{0,2,0,0,2,0},
			{1,2,4,1,2,4},
		};
		Assert.assertEquals(19, HourGlasses2DArray.findTheLargestSum(input));
	}
	
	@Test
	public void testHourGlassWithTheLargestSumWithNegativeNumbers() {
		int[][] input = new int[][] {
			{-9,-9,-9,-9,-9,-9},
			{-9,-9,-9,-9,-9,-9},
			{-9,-9,-9,-9,-9,-9},
			{-9,-9,-9,-9,-9,-9},
			{-9,-9,-9,-9,-9,-9},
			{-9,-9,-9,-9,-9,-9}
		};
		Assert.assertEquals(-63, HourGlasses2DArray.findTheLargestSum(input));
	}
	
}
