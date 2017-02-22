package maths;

public class Power {

	public static double powIterative(final double base, final int exponent) {
		double result = 1;
		
		for (int i=0; i<exponent; i++)
			result *= base;
		
		return result;
	}

	public static double powRecursive(final double base, final int exponent) {
		if (exponent == 1) return base;
		return base*Power.powRecursive(base,  exponent-1);
	}
	
}
