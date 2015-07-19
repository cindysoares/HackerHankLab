import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<BigDecimal> list = new ArrayList<BigDecimal>(n);
        while(s.hasNext() & n!=0) {
            list.add(s.nextBigDecimal());
            n--;
        }
        
        list.sort((BigDecimal x, BigDecimal y) -> y.compareTo(x));
        
        DecimalFormat df = new DecimalFormat("");
        df.setGroupingSize(0);
        list.stream().forEach((BigDecimal b) -> System.out.println(df.format(b)));
        s.close();
    }
    
}
