import org.junit.Assert;
import org.junit.Test;


public class ProjectEarthTest {
	
	@Test
	public void test() {
		Assert.assertEquals(2, ProjectEarth.reactionTime(5, 3));
		Assert.assertEquals(4, ProjectEarth.reactionTime(4, 2));
		Assert.assertEquals(14, ProjectEarth.reactionTime(10, 20));
		Assert.assertEquals(5, ProjectEarth.reactionTime(11, 5));
		Assert.assertEquals(5, ProjectEarth.reactionTime(15, 5));
	}

}
