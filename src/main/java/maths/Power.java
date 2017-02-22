package maths;

public class Power {

	public static double powIterative(final double base, final int exponential) {
		double result = base;
		
		for (int i=1; i<exponential; i++)
			result *= base;
		
		return result;
	}

	public static double powRecursive(final double base, final int exponential) {
		if (exponential == 1) return base;
		return base*Power.powRecursive(base,  exponential-1);
	}
	
}
