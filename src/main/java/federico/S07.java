package federico;

public class S07 {

	/**
	 * States whether an integer number is "PERFECT" or not
	 * 
	 * @param value
	 * @return true (if value is perfect) or false (if it's not)
	 */
	public static boolean isPerfect(int value) {
		boolean result = false;
		if ((value>0)&&(value%2 == 0)) {
			int i = 1;
			int sum = 1;
			while (i < Math.ceil(Math.sqrt(value))) {
				i += 1;
				if (value%i == 0) {
					sum += (i + (value/i));
				}
			}
			if (sum == value) {
				result = true;
			}
		}
		return result;
	}
	
	
	/**
	 * States whether an integer number is "ABUNDANT" or not ->
	 * -> ABUNDANT is when the sum of proper divisors is greater than the number
	 * 
	 * @param value
	 * @return true (if value is abundant) or false (if it's not)
	 */
	public static boolean isAbundant(int value) {
		boolean result = false;
		if (value>0) {
			int i = 1;
			int sum = 1;
			while (i < Math.ceil(Math.sqrt(value))) {
				i += 1;
				if (value%i == 0) {
					sum += (i + (value/i));
				}
			}
			if (sum > value) {
				result = true;
			}
		}
		return result;
	}
	
	
	/**
	 * States whether an integer number is "DEFICIENT" or not ->
	 * -> DEFICIENT is when the sum of proper divisors is lower than the number
	 * 
	 * @param value
	 * @return true (if value is deficient) or false (if it's not)
	 */
	public static boolean isDeficient(int value) {
		boolean result = false;
		if (value>0) {
			int i = 1;
			int sum = 1;
			while (i < Math.ceil(Math.sqrt(value))) {
				i += 1;
				if (value%i == 0) {
					sum += (i + (value/i));
				}
			}
			if (sum < value) {
				result = true;
			}
		}
		return result;
	}
	
}
