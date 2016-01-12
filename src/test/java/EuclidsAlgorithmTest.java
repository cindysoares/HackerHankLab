import org.junit.Assert;
import org.junit.Test;

public class EuclidsAlgorithmTest {

	@Test
	public void testFindGCD_1_5() {
		Assert.assertEquals(1, EuclidsAlgorithm.find_gcd(1, 5));
	}
	
}
