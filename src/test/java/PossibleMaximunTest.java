
import org.junit.Assert;
import org.junit.Test;


public class PossibleMaximunTest {
	
	@Test
	public void testMaximun() {
		Assert.assertEquals(1, PossibleMaximum.possibleMaximun(5, 2));
		Assert.assertEquals(4, PossibleMaximum.possibleMaximun(8, 5));
		Assert.assertEquals(0, PossibleMaximum.possibleMaximun(2, 2));
		Assert.assertEquals(2, PossibleMaximum.possibleMaximun(8, 3));
	}

}
