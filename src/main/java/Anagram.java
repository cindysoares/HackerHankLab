import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
	
	private static final List<String> dictionaryWords = new ArrayList<String>();
	
	static  {
		try {
			InputStream dictionary = Anagram.class.getResourceAsStream("wl.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(dictionary));
			String line = reader.readLine();		
			while(line != null) {
				dictionaryWords.add(line);
				line = reader.readLine();
			}
			reader.close();
			dictionary.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> getAnagram(String word) {
		List<String> result = new ArrayList<>();
		
		for (String dictionaryWord : dictionaryWords) {
			if(word.length() != dictionaryWord.length()
					|| word.equals(dictionaryWord)) continue;
			
			char[] letters = dictionaryWord.toCharArray();
			Arrays.sort(letters);
			char[] letters2 = word.toCharArray();
			Arrays.sort(letters2);
			
			if(String.valueOf(letters, 0, letters.length).equals(String.valueOf(letters2, 0, letters2.length)) ) {
				result.add(dictionaryWord);
			}
		}
		
		return result;
	}
	
}
