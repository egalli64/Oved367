package davide;


public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		String inversa="";
		for(int i=s.length()-1;i>=0;i--) {
			inversa +=s.charAt(i);
		}
		return inversa;
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		int k=0;
		for(int i=0;i==s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				
			}
			else{
				k=1;
			}
		}
		if(k==0) {
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
		String rVowels="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u') {
				rVowels += s.charAt(i);
			}
		}

	           
		return rVowels;
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		int dec=0;
		for (int i=0; i<s.length();i++) {
			if(s.charAt(i)=='1') {
				dec += Math.pow(2,i);
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
		int sum=0;
		int media=0;
		for (int i=0; i<data.length;i++) {
			sum += data[i];
		}
		media=sum/data.length;
		return media;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int maxValue = 0;
		for (int i=0; i<data.length;i++) {
			if(i==0) {
				maxValue=data[i];
			}
			if(data[i]>maxValue) {
				maxValue=data[i];
			}
		}
		return maxValue;
	}
}
