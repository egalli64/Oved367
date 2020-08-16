package emilia;


public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		
		int len = s.length();
		
		StringBuilder sreverse = new StringBuilder (len);
		
		for (int i=len-1; i>=0; i--) {
			sreverse.append(s.charAt(i));
		}
		
		return sreverse.toString();
	}
		
	/*	String sreverse = "";
		
		for (int i=len-1;i>=0;i--) {
			sreverse = sreverse+ s.charAt(i);
		}
		
		return sreverse;
	}*/
	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		
		int len = s.length();
		
		String sreverse = "";
		for (int i=len-1 ;i>=0; i--) {
			sreverse = sreverse  + s.charAt(i);
			}
		if(sreverse.equals(s)) {
		return true;
	}
		return false;
		
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
	
		int len = s.length();
		
		String snovow = "";
		
		for (int i=0 ;i<len; i++) {
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
				snovow = snovow + s.charAt(i);
			}
		}
		return snovow;
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		char[] num = s.toCharArray();
		int dec = 0;
	for (int i=num.length-1; i>=0; i--) {
			switch(num[i]){
			case '1':
			dec += Math.pow(2,i);	
			case '0':
				break;
			default:
				return Integer.MIN_VALUE;
			}
	}
	return dec;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];

		for (int i = 0; i<data.length; i++) {
			result[i]=data[data.length-i-1];
		}

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double sum=0;
		for (int i=0; i<data.length; i++) {
			sum +=data[i];
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
		for(int i=0; i<data.length; i++) {
			if(data[i]>=max) {
				max=data[i];
			}
			}
		return max;
	}
}

