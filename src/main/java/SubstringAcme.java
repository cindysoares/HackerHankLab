import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringAcme {
	
	static int firstOccurance(String a, String b) {
		if(a==null || b==null) {
			return -1;
		}
		String regex = b.replaceAll("\\*", "\\\\p{Lower}");
		System.out.println(regex);
		Matcher m = Pattern.compile(regex).matcher(a);
		if (m.find()) {
			return m.start();
		}
		return -1;
	}

}
