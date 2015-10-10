import org.junit.Assert;
import org.junit.Test;


public class ProjectEarthTest {
	
	@Test
	public void test() {
		Assert.assertEquals(2, ProjectEarth.reactionTime(5, 3));
	}

}
