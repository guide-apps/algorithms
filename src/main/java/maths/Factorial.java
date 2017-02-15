package maths;

public class Factorial {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new Factorial().calculateIterative(1000);
		long end = System.currentTimeMillis();		
		System.out.println(String.format("Execution iterative: %d", (end-start)));
		
		start = System.currentTimeMillis();
		new Factorial().calculateRecursive(1000);
		end = System.currentTimeMillis();		
		System.out.println(String.format("Execution recursive: %d", (end-start)));
	}
	
	public long calculateIterative(final long n) {
		long result = 1;
		
		for (int i=2; i<=n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public long calculateRecursive(final long n) {
		if (n == 0)
			return 1;
		
		return n*calculateRecursive(n-1);
	}
	
}
