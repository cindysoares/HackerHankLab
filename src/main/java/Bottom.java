import java.util.ArrayList;
import java.util.List;

interface X {
	String top = "";
}

class Top {
}

public class Bottom extends Top{
	

	public static void main(String[] args) {
		String a = "test";
		String b = "exam";
		b = a;
		String c = new String(a);
		System.out.println(c==a);
	}
	
}
