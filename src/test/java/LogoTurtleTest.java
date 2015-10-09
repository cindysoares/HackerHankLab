import org.junit.Assert;
import org.junit.Test;

public class LogoTurtleTest {
	
	@Test
	public void test1() {
		int answer = new LogoTurtle().solution(new int[] {1,3,2,5,4,4,6,3,2});
		Assert.assertEquals(7, answer);
	}
	
	@Test
	public void test2() {
		int answer = new LogoTurtle().solution(new int[] {2,1,3,2,4,4,5,5,6,6,8,2,6,1,1,2});
		Assert.assertEquals(13, answer);
	}
	
	@Test
	public void test3() {
		int answer = new LogoTurtle().solution(new int[] {2,1,3,2,4,4,5,5,6,6,8,2,2});
		Assert.assertEquals(13, answer);
	}
	
	@Test
	public void test4() {
		int answer = new LogoTurtle().solution(new int[] {2,1});
		Assert.assertEquals(0, answer);
	}

}
