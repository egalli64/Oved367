package federico;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long s = 0;
		if (first>last) {
			return 0;
		} else {
			for (int i = first; i<=last; i++) {
				s += i;
			}
		}
		return s;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long s = 0;
		if (first>last) {
			return 0;
		} else {
			if (first%2 ==0) {
				for (int i = first; i<=last; i+=2) {
					s += i;
				}
			} else {
				for (int i = first+1; i<=last; i+=2) {
					s += i;
				}
			}
		}
		return s;
	}

	
	/**
	 * Function calculating y = x^2-alfa					///  !!!  ADDED BY ME  !!!  ///
	 * 
	 * @param x
	 * @param alfa
	 * @return y = f(x)
	 */
	public static double f(double x, double alfa) {
		double y = Math.pow(x, 2)-alfa;
		return y;
	}
	
	
	/**
	 * Square root using Newton method -> that is: solving equation x^2-value = 0
	 * Epsilon should be set to 0.001
	 *  
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		if (value<0) {
			return Double.NEGATIVE_INFINITY;
		} else if (value == 0) {
			return 0;
		} else {
			double sol0 = 5;
			double sol1 = sol0 - f(sol0,value)/(2*sol0);		
			double exp_sol = Math.sqrt(value);
			while ((Math.abs(sol1-exp_sol)>0.001)&&(Math.abs(sol1-sol0)>0.001)) {
				sol0 = sol1;
				sol1 = sol0 - f(sol0,value)/(2*sol0);
			}
			return sol1;
		}
	}

	/**
     * Square root using Newton method
     * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
    public static double sqrt(double value, double epsilon) {
    	if (value<0) {
			return Double.NEGATIVE_INFINITY;
		} else if (value == 0) {
			return 0;
		} else {
			double sol0 = 5;
			double sol1 = sol0 - f(sol0,value)/(2*sol0);		
			double exp_sol = Math.sqrt(value);
			while ((Math.abs(sol1-exp_sol)>epsilon)&&(Math.abs(sol1-sol0)>epsilon)) {
				sol0 = sol1;
				sol1 = sol0 - f(sol0,value)/(2*sol0);
			}
			return sol1;
		}
    }
	
	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		long f;
		if (value < 0) {
			f = 0;
		} else if (value == 0) {
			f = 1;
		} else {
			f = value * factorial(value-1);
		}
		return f;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero (if value<0)
	 */
	public static long fibonacci(int value) {
		long fib;
		if (value < 0) {
			fib = 0;
		} else if (value == 0) {
			fib = 0;
		} else if (value ==1 ){
			fib = 1;
		} else {
			fib = fibonacci(value-2) + fibonacci(value-1);
		}
		return fib;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		if (value<=0) {
			int [][] result = new int[0][0];
			return result;
		} else {
			int[][] result = new int[value][value];
			int i = 0;
			while (i<value) {
				for (int j=i; j<value; j++) {
					result [i][j] = (i+1)*(j+1);
					result [j][i] = (i+1)*(j+1);
				}
				i++;
			}
			return result;
		}
	}
	
}
