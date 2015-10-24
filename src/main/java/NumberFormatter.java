
public class NumberFormatter {
	
	public static final String format(int number) {
		String result = String.valueOf(number);
		
		StringBuffer b = new StringBuffer(result);
		int length = result.length();
		int commaCount = Math.abs((length-1)/3);
		for (int i = 1; i <= commaCount; i++) {
			int index = length - (3 * i);
			b.insert(index, ',');
		}
		
		return b.toString();
	}

}
