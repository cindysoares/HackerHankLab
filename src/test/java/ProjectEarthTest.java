import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;


public class ProjectEarthTest {
	
	@Test
	public void test() {
		Assert.assertEquals(new BigInteger("2"), ProjectEarth.reactionTime(new BigInteger("5"), new BigInteger("3")));
		Assert.assertEquals(new BigInteger("29999999999999999999999999999999999"), 
				ProjectEarth.reactionTime(new BigInteger("5"), new BigInteger("30000000000000000000000000000000000")));
	}

}
