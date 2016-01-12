import org.junit.Assert;
import org.junit.Test;

public class PathSegmentsTest {

	@Test
	public void test1() {
		Assert.assertEquals("/foo/bar/file", PathSegments.createPath(new String[] {"foo", "bar", "file"}));		
	}

	@Test
	public void test2() {
		Assert.assertEquals("/foo/test/bob", PathSegments.createPath(new String[] {"foo", "bar", "..", "test", "thing", "..", "bob"}));		
	}

}
