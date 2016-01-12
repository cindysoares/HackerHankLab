
import org.junit.Assert;
import org.junit.Test;

public class JudgeSortTest {
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new String[] {"-2", "0", "4", "nine", "Invalid: oner", "Invalid: negative teen" } , 
				JudgeSort.sort("4,nine,oner,-2,0,negative teen"));
	}

}
