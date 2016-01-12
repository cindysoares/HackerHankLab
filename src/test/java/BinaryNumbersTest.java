import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;


public class BinaryNumbersTest {
	
	@Test
	public void testConvertBase10ToBinary_5() {
		Assert.assertEquals(new BigInteger("101"), BinaryNumbers.convertToBinary(5));
	}
	
	@Test
	public void testConvertBase10ToBinary_4() {
		Assert.assertEquals(new BigInteger("100"), BinaryNumbers.convertToBinary(4));
	}
	
	@Test
	public void testConvertBase10ToBinary_32() {
		Assert.assertEquals(new BigInteger("100000"), BinaryNumbers.convertToBinary(32));
	}
	
	@Test
	public void testConvertBase10ToBinary_33() {
		Assert.assertEquals(new BigInteger("100001"), BinaryNumbers.convertToBinary(33));
	}
	
	@Test
	public void testConvertBase10ToBinary_1000() {
		Assert.assertEquals(new BigInteger("1111101000"), BinaryNumbers.convertToBinary(1000));
	}
	
	@Test
	public void testConvertBase10ToBinary_2000() {
		Assert.assertEquals(new BigInteger("11111010000"), BinaryNumbers.convertToBinary(2000));
	}
	
	@Test
	public void testConvertBase10ToBinary_937() {
		Assert.assertEquals(new BigInteger("1110101001"), BinaryNumbers.convertToBinary(937));
	}
	
	@Test
	public void testConvertBase10ToBinary_2exp31() {
		Assert.assertEquals(new BigInteger("10000000000000000000000000000000"), 
				BinaryNumbers.convertToBinary((long) Math.pow(2, 31)));
	}
	
	@Test
	public void testConvertBase10ToBinary_GreaterThan2exp31() {
		Assert.assertEquals(null, BinaryNumbers.convertToBinary((long) (Math.pow(2, 31)+1)));
	}
	
	@Test
	public void testLog2of5() {
		Assert.assertEquals(2, BinaryNumbers.log2(5));
	}
	
	@Test
	public void testLog2of32() {
		Assert.assertEquals(5, BinaryNumbers.log2(32));
	}
	
	@Test
	public void testLog2of2pow31() {
		Assert.assertEquals(31, BinaryNumbers.log2((long) Math.pow(2, 31)));
	}

}
