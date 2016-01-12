import org.junit.Assert;
import org.junit.Test;

public class IfElseStatementsTest {

	@Test
	public void testOddWeird() {
		Assert.assertEquals("Weird", IfElseStatements.getAnswer(1));
	}
	
	@Test
	public void testEvenNotWeird() {
		Assert.assertEquals("Not Weird", IfElseStatements.getAnswer(4));
	}

	@Test
	public void testEvenWeird() {
		Assert.assertEquals("Weird", IfElseStatements.getAnswer(20));
	}

	@Test
	public void testEvenNotWeirdGreaterThan20() {
		Assert.assertEquals("Not Weird", IfElseStatements.getAnswer(22));
	}

}
