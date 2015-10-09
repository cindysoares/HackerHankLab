import org.junit.Assert;
import org.junit.Test;

public class IPAdressValidationTest {
	
	@Test
	public void testIPv4() {
		Assert.assertEquals("IPv4", IPAdressValidation.checkIP("1.1.1.1"));
	}
	
	@Test
	public void testInvalidIPv4_1() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("1.1.1"));
	}
	
	@Test
	public void testInvalidIPv4_2() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("1.1.1.1.1"));
	}
	
	@Test
	public void testInvalidIPv4_3() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("a.a.a.a"));
	}
	
	@Test
	public void testInvalidIPv4_4() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("1.1.1.256"));
	}
	
	@Test
	public void testNeither() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("Any text"));
	}

	@Test
	public void testIPv6() {
		Assert.assertEquals("IPv6", IPAdressValidation.checkIP("ff00:0000:5:e887:0:ff00:0000:5"));
	}
	
	@Test
	public void testInvalidIPv6_1() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("ff00:0000:5:e887"));
	}
	
	@Test
	public void testInvalidIPv6_2() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("ff00:0000:5:e887:0:ff00:0000:5:e887:0:0"));
	}
	
	@Test
	public void testInvalidIPv6_3() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("ff00:00000:5:e887:0:ff00:0000:5:e887:0:0"));
	}

	@Test
	public void testInvalidIPv6_4() {
		Assert.assertEquals("Neither", IPAdressValidation.checkIP("zf00:0000:5:e887:0:ff00:0000:5:e887:0:0"));
	}

}
