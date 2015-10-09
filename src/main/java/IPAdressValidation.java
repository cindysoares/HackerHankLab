import java.util.StringTokenizer;

public class IPAdressValidation {
	
    static String IPv4 = "IPv4";
    static String IPv6 = "IPv6";
    static String NEITHER = "Neither";

    static String[] check_IP(String[] s) {
        int n = s.length;
        String[] result = new String[n];
        for (int i = 0; i<n; i++) {
            String answer = NEITHER;
            String value = s[i];
            if(checkIPv4(value)) {
                answer = IPv4;
            } else if(checkIPv6(value)) {
                answer = IPv6;
            }
            result[i] = answer;
        }
        return result;
    }

    static boolean checkIPv4(String value) {
    	StringTokenizer tokens = new StringTokenizer(value, ".");
    	if(tokens.countTokens() == 4) {
    		while (tokens.hasMoreTokens()) {
				String nextToken = tokens.nextToken();
				try {
					int tokenValue = Integer.parseInt(nextToken);
					if (tokenValue > 255) return false;
				} catch(NumberFormatException e) {
					return false;
				}
			}
    		return true;
    	}
    	return false;
    }

    static boolean checkIPv6(String value) {
    	StringTokenizer tokens = new StringTokenizer(value, ":");
    	if(tokens.countTokens() == 8) {
    		while (tokens.hasMoreTokens()) {
				String nextToken = tokens.nextToken();
				try {
					if(nextToken.length() > 4) return false;
					Integer.decode("0x" + nextToken);
				} catch(NumberFormatException e) {
					return false;
				}
			}
    		return true;
    	}
    	return false;
    }

    static String checkIP(String value) {
    	return check_IP(new String[] {value})[0];
    }
}
