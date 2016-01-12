import java.util.Collection;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.naming.InvalidNameException;

public class JudgeSort {

	enum NameOfNumber {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN}

	static String[] sort(String judgesInput) {
		StringTokenizer buffer = new StringTokenizer(judgesInput, ",");
		Collection<String> strings = new TreeSet<String>((String s1, String s2) -> {
			Integer i1, i2;
			try {
				i1 = convertInt(s1);
			} catch (InvalidNameException e) {
				return 1;
			}
			try {
				i2 = convertInt(s2);
			} catch (InvalidNameException e) {
				return -1;
			}
			return i1 > i2 ? 1 : (i1==i2? 0: -1);
		});
		while (buffer.hasMoreTokens()) {
			String s = buffer.nextToken();
			try {
				convertInt(s);
				strings.add(s); 
			} catch(InvalidNameException e) {
				strings.add(e.getMessage());
			}
		}

		String[] array = new String[strings.size()];
		return strings.toArray(array);
	}

	static int convertInt(String s) throws InvalidNameException {
		try {
			return Integer.valueOf(s);
		}catch(NumberFormatException e) {
			NameOfNumber name = null;
			try {
				name = NameOfNumber.valueOf(s.toUpperCase());
			} catch(IllegalArgumentException i) {
				if (name == null) {
					throw new InvalidNameException("Invalid: " + s);
				}
			}
			return name.ordinal();
		}
	}

}
