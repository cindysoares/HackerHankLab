import org.junit.Assert;
import org.junit.Test;

public class DataTypesTest {

	@Test
	public void testInt() {
		Assert.assertEquals("Primitive : int", DataTypes.getDataType("1"));
	}
	
	@Test
	public void testDouble() {
		Assert.assertEquals("Primitive : double", DataTypes.getDataType("1.0"));
	}

	@Test
	public void testBoolean() {
		Assert.assertEquals("Primitive : boolean", DataTypes.getDataType("true"));
	}
	
	@Test
	public void testChar() {
		Assert.assertEquals("Primitive : char", DataTypes.getDataType("a"));
	}

	@Test
	public void testString() {
		Assert.assertEquals("Referenced : String", DataTypes.getDataType("string"));
	}


}
