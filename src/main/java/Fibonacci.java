
public class Fibonacci {
	

    static int[] fibonacci(int n) {
        int[] result = new int[n];
        for (int i=0; i < n; i++) {
            result[i] = fib(i);            
        }
        return result;
    }

    static int fib(int n) {
        if (n <=1) {
            return n;
        } else {
            return fib(n-2) + fib(n-1);
        }
    }

}
