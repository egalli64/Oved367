package nicole;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		String s1="";
		for (int i=s.length()-1; i>=0; i--) {
			s1= s1 +s.charAt(i);
		}
		return s1;
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		for (int i=0; i<=s.length()/2; i++) {
			if (s.charAt(i)==s.charAt(s.length()-1-i)) {
				return true;
			}
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
		String result= "";
		for (int i=0; i<=s.length()-1; i++) {
			if (s.charAt(i)!='a'&& s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o'&& s.charAt(i)!='u') {
		
				result+= s.charAt(i);
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
		int result=0;
		for (int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)!='0') {
				result+= Math.pow(2,s.length()-1-i);
			}
			
		}
			
		return result;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
		for (int i=0; i<=data.length-1;i++) {
			result[i]=data[data.length-1-i];
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
		double avrg=0;
		for (int i=0; i<=data.length-1; i++) {
		avrg+=data[i];	
		}
		avrg=avrg/data.length;
		return avrg;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int maximum=data[0];
		for (int i=1; i<=data.length-1; i++) {
			if (data[i]>data[i-1]) {
				maximum=data[i];
			}
		}
		return maximum;
	}
}

