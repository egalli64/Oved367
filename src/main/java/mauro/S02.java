package mauro;

public class S02 {
	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 * @throws ExciseExpection when value is negative
	 */
	public static int digitSum(int value) throws ExciseExpection {
		
		if (value < 0) {
			throw new ExciseExpection("Negative values aren't allowed");
		}
		int count = 0;
		while (value > 0) {
			count += value % 10;
			value /= 10;
		}
		return count;
	}
}