import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	private static Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneBook.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			Integer number = phoneBook.get(s);
			System.out.println(number==null? "Not found" : s+"="+number);
		}
		in.close();
	}
}
