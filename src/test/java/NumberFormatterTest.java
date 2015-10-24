import org.junit.Assert;
import org.junit.Test;


public class NumberFormatterTest {
	
	@Test
	public void test() {
		test(1, "1");
		test(10, "10");
		test(100, "100");
		test(1000, "1,000");
		test(10000, "10,000");
		test(100000, "100,000");
		test(1000000, "1,000,000"); //1000000 -> "1,000,000"
		test(35235235, "35,235,235");
		test(999999999, "999,999,999");
	}
	
	private void test(int number, String result) {
		Assert.assertEquals(result,NumberFormatter.format(number));
	}

}
