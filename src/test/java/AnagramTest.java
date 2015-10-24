import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void test() {
		test("beat","bate","beta" );
		test("able","abel","bale", "beal" );
		test("apple","appel"); //"apple" => ["appel"]
		test("spot","post","pots", "stop", "tops" ); //spot"  => ["post", "pots", "stop", "tops"]
		test("reset","steer","trees" ); //"reset" => ["steer", "trees"]
	}
	
	public void test(String word, String... anagrams) {
		List<String> result = Anagram.getAnagram(word);
		Assert.assertNotNull(anagrams);
		Assert.assertEquals("Wrong numbers of anagrams: " + anagrams, 
				anagrams.length, result.size());
		
		Collections.sort(result);
		for (int i = 0; i < result.size(); i++) {
			Assert.assertEquals(anagrams[i], result.get(i));
			
		}
	}
}
