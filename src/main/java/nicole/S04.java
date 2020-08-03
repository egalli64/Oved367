package nicole;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {

		if (first < last) {
			int result = 0;
			for (int current = first; current <= last; current++) {
				result += current;
			}
			return result;
		} else if (first == last) {
			return first;
		} else {
			return 0;
		}

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		int sum = 0;
		if (first > last) {
			return 0;
		} else {
			for (int i = first; i <= last; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
		}
		return sum;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		double epsilon = 0.001;

		double radqPre = value / 2;
		double radq = 1 / 2 * (radqPre + (value / radqPre));
		double err = radqPre - radq;

		while (err > epsilon) {
			radqPre = radq;
			radq = 1 / 2 * (radqPre + (value / radqPre));
			err = radqPre - radq;
		}

		return radq;
	}

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		double radqPre = value / 2;
		double radq = 1 / 2 * (radqPre + (value / radqPre));
		double err = radqPre - radq;

		while (err > epsilon) {
			radqPre = radq;
			radq = 1 / 2 * (radqPre + (value / radqPre));
			err = radqPre - radq;
		}

		return radq;

	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {

		int fact = 0;
		int valore = value;

		if (value < 0) {
			fact = 0;
		} else if (value >= 1) {

			for (int i = value; i > 1; i--) {
				fact = valore * (i - 1);
				valore = fact;
			}
		} else {
			fact = 1;
		}
		return fact;

	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

		int result = 0;
		if (value == 0 || value < 1) {
			result = 0;
		} else if (value == 1) {
			result = 1;
		} else {
			int n1 = 0;
			int n2 = 1;
			for (int i = 2; i <= value; i++) {
				result = n1 + n2;
				n1 = n2;
				n2 = result;
			}
		}
		return result;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		for (int i=0; i<value; i++) {
			for (int j=0; j<value; j++) {
				result[i][j]=(i+1)*(j+1);
			}
		}


		return result;
	}
}
