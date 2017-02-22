package maths;

public class Power {

	public static double powRecursive(final double base, final int exponent) {
		if (exponent == 1) return base;
		
		if (exponent < 0)
			return (exponent*-1)/base;
		
		if (exponent % 2 == 0) {
			double half = Power.powRecursive(base,  exponent/2);
			return half*half;
		}
		
		return Power.powRecursive(base,  exponent-1)*base;
	}
	
}
