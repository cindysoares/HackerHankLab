import org.junit.Assert;
import org.junit.Test;

public class ArrayInReverseOrderTest {
	
	@Test
	public void testReverseOrder() {
		Assert.assertEquals("2 3 4 1", ArrayInReverseOrder.printInReverseOrder(new int[] {1, 4, 3, 2}));
	}

}
