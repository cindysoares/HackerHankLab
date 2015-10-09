import org.junit.Assert;
import org.junit.Test;

public class SplitingArraysTest {
	
	@Test
	public void test1() {
		int answer = new SplitingArrays().solution(5, new int[] {5,5,1,7,2,3,5});
		Assert.assertEquals(4, answer);
	}
	
	@Test
	public void test2() {
		int answer = new SplitingArrays().solution(5, new int[] {5,5,5,7,2,3,5});
		Assert.assertEquals(3, answer);
	}	
	
	@Test
	public void test3() {
		int answer = new SplitingArrays().solution(5, new int[] {5,1,1,7,2,3,5});
		Assert.assertEquals(5, answer);
	}	


}
