

import org.junit.Assert;
import org.junit.Test;


public class SubstringAcmeTest {
	
	@Test
	public void testSimpleBinsideA() {
		test("thisisatesthis", "this", 0);
	}
	
	@Test
	public void testBNotInsideA() {
		test("thisisatesthis", "x", -1);
	}
	
	@Test
	public void testEmptyB() {
		test("thisisatesthis", null, -1);
	}
	
	@Test
	public void testEmptyA() {
		test(null, "this", -1);
	}

	
	@Test
	public void testBInsideAContainingAsterisk() {
		test("thisisatesthis", "thi*", 0);
	}
	
	private void test(String a, String b, int expectedIndex) {
		Assert.assertEquals(expectedIndex, SubstringAcme.firstOccurance(a, b));
	}

}
