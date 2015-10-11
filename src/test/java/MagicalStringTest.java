import org.junit.Assert;
import org.junit.Test;

public class MagicalStringTest {
	
	@Test
	public void test() {
		Assert.assertEquals(3, MagicalString.countOccurences(1, 6));
		Assert.assertEquals(2, MagicalString.countOccurences(2, 4));
		Assert.assertEquals(2, MagicalString.countOccurences(1, 4));
		Assert.assertEquals(3, MagicalString.countOccurences(2, 6));
		
		Assert.assertEquals(1, MagicalString.countOccurences(1, 3));
		Assert.assertEquals(2, MagicalString.countOccurences(2, 3));
		Assert.assertEquals(3, MagicalString.countOccurences(1, 5));
		Assert.assertEquals(2, MagicalString.countOccurences(2, 5));	
		Assert.assertEquals(5, MagicalString.countOccurences(1, 12));
		Assert.assertEquals(7, MagicalString.countOccurences(2, 12));
		Assert.assertEquals(7, MagicalString.countOccurences(1, 15));
		Assert.assertEquals(8, MagicalString.countOccurences(2, 15));
		Assert.assertEquals(13, MagicalString.countOccurences(1, 25));
		Assert.assertEquals(12, MagicalString.countOccurences(2, 25));
		Assert.assertEquals(25, MagicalString.countOccurences(1, 49));
		Assert.assertEquals(24, MagicalString.countOccurences(2, 49));
		Assert.assertEquals(53, MagicalString.countOccurences(1, 108));
		Assert.assertEquals(55, MagicalString.countOccurences(2, 108));
		Assert.assertEquals(53, MagicalString.countOccurences(1, 107));
		Assert.assertEquals(54, MagicalString.countOccurences(2, 107));
	}
	
	
	/*
	 * 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 2, 1, 
	 * 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 
	 * 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 
	 * 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 
	 * 1, 2, 1, 1, 2, 1, 2, 2
	 * */
	@Test
	public void testMagicalStringProduced() {
		Assert.assertEquals('1', MagicalString.chatAtPositionN(17));
		Assert.assertEquals("12211212212211211", MagicalString.S.toString());
		
		Assert.assertEquals('2', MagicalString.chatAtPositionN(18));
		Assert.assertEquals("1221121221221121122", MagicalString.S.toString());

		Assert.assertEquals('2', MagicalString.chatAtPositionN(19));
		Assert.assertEquals("1221121221221121122", MagicalString.S.toString());

		Assert.assertEquals('1', MagicalString.chatAtPositionN(20));
		Assert.assertEquals("12211212212211211221", MagicalString.S.toString());

		Assert.assertEquals('2', MagicalString.chatAtPositionN(21));
		Assert.assertEquals("122112122122112112212", MagicalString.S.toString());

		Assert.assertEquals('1', MagicalString.chatAtPositionN(22));
		Assert.assertEquals("12211212212211211221211", MagicalString.S.toString());

		Assert.assertEquals('1', MagicalString.chatAtPositionN(23));
		Assert.assertEquals("12211212212211211221211", MagicalString.S.toString());
		
		Assert.assertEquals('2', MagicalString.chatAtPositionN(24));
		Assert.assertEquals("122112122122112112212112", MagicalString.S.toString());
		
		Assert.assertEquals('1', MagicalString.chatAtPositionN(25));
		Assert.assertEquals("1221121221221121122121121", MagicalString.S.toString());
		
		Assert.assertEquals('2', MagicalString.chatAtPositionN(50));
		Assert.assertEquals("12211212212211211221211212211211212212211212212112", MagicalString.S.toString());
	}

}
