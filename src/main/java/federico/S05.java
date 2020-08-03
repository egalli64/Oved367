package federico;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		String result = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		return result;
	}
	

	private static int length(String s) {			//	-> why "private" here ??  //
		// Auto-generated method stub  							---	??? ---
		char [] c = s.toCharArray();
		
		return c.length;
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		if (s.compareTo(reverse(s))==0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			//char c = s.charAt(i);
			switch (s.charAt(i)) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'o':
				break;
			case 'u':
				break;
			case 'A':
				break;
			case 'E':
				break;
			case 'I':
				break;
			case 'O':
				break;
			case 'U':
				break;
			default:
				result = result + s.charAt(i);
			}
		}
		return result;
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// [1][0][0][0][1]
	    // 43_210
	    // 2
		char [] num = s.toCharArray();
		int sum = 0;
		for (int i = num.length-1; i >= 0; i--) {
			switch (num[i]) {
			case '1':
				sum += Math.pow(2, i);
				break;
			case '0':
				break;
			default:
				return Integer.MIN_VALUE;
			}
		}
		return sum;
	}

	/**
	 * Reverse an array of integers (in another array)
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
		
		for(int i = 0; i < data.length; i++) {
			result [i] = data[data.length-i-1];
		}
		return result;
	}
	
	
	/**
	 * Reverse an array of integers (in the same array)
	 * 
	 * @param data
	 * @return the same input array, holding the same elements, in reversed order
	 */
	public static int[] reversesame(int[] data) {
		for(int i = 0; i < Math.ceil(data.length/2); i++) {
			int aux = data [i];
			data [i] = data[data.length-i-1];
			data[data.length-i-1] = aux;
		}
		return data;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum/data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
