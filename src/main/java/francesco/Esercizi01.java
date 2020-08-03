package francesco;

public class Esercizi01 {

	public static boolean isPrime(int value) {
		boolean test = true;
		for (int i = 2; i < value / 2; i++) { // I see if it is divisible for any number less than value/2
			if (value % i == 0) {
				test = false;
				break;
			}
		}
		return test;
	}

	public static boolean isArmstrong(int value) {
		int[] digits = new int[32];
		int numberOfDigits = 0;
		int total = 0;
		int temp = value;
		for (int i = 0; value != 0; i++) { // I store the digits and count their number
			digits[i] = value % 10;
			value /= 10;
			numberOfDigits++;
		}
		for (int i = 0; i < numberOfDigits; i++) { // Check if it is an Armstrong number
			total += Math.pow(digits[i], numberOfDigits);
		}
		return total == temp;
	}

	public static String reverse(String s) {
		String[] rev = new String[s.length()];
		for (int i = 0; i < s.length(); i++) { // Split the string in a string array made of length 1 for each char
			rev[i] = s.substring(i, i + 1);
		}
		String[] sReturn = new String[s.length()]; // Create an array of strings
		sReturn[0] = rev[s.length() - 1];
		for (int i = 1; i < s.length(); i++) {
			sReturn[i] = sReturn[i - 1].concat(rev[s.length() - i - 1]); // Each element of the array contains the
																			// previous element plus the next one, in a
																			// descending order from the initial string
		}
		return sReturn[s.length() - 1];
	}

	public static String binarySum(String s, String t) {
		String[] firstNumber = new String[32];
		String[] secondNumber = new String[32];
		for (int i = 0; i < s.length(); i++) {
			firstNumber[i] = s.substring(i, i + 1); // Decompose the numbers in a string array
			secondNumber[i] = t.substring(i, i + 1);
		}
		String[] resString = new String[s.length() + 1];
		boolean isRest = false;
		int temp = 0;
		for (int i = 0; i < s.length(); i++) { // Loop for the different cases
			if (firstNumber[s.length() - 1 - i].equals("1")) {
				temp++;
			}
			if (secondNumber[s.length() - 1 - i].equals("1")) {
				temp++;
			}
			if (isRest) {
				temp++;
			}
			if (temp > 1) {
				isRest = true;
			} else if (temp <= 1) {
				isRest = false;
			}
			if (temp % 2 == 1) {
				resString[s.length() - i] = "1";
			} else {
				resString[s.length() - i] = "0";
			}
			temp = 0;
		}
		if (isRest) {
			resString[0] = "1";
		} else {
			resString[0] = "0";
		}
		String[] resConcat = new String[s.length() + 1];
		resConcat[0] = resString[0];
		for (int i = 1; i < s.length() + 1; i++) {
			resConcat[i] = resConcat[i - 1].concat(resString[i]);
		}
		return resConcat[s.length()];
	}

	private static int[] mergeSorted(int[] array1, int[] array2) {
		int[] array = new int[array1.length + array2.length];
		int count1 = 0;
		int count2 = 0;
		int minLength = array1.length;
		int tempIndex = 0;
		if (array1.length != array2.length) {
			if (array1.length < array2.length) {
				minLength = array1.length;
			} else {
				minLength = array2.length;
			}
		}
		for (int i = 0; i < 2 * minLength && count1 < array1.length && count2 < array2.length; i++) {
			if (array1[count1] < array2[count2]) {
				array[i] = array1[count1];
				count1++;
			} else {
				array[i] = array2[count2];
				count2++;
			}
			tempIndex++;
		}
		if (count1 != array1.length) {
			for (int i = tempIndex; i < array1.length + array2.length; i++) {
				array[i] = array1[count1];
				count1++;
			}
		} else if (count2 != array2.length) {
			for (int i = tempIndex; i < array1.length + array2.length; i++) {
				array[i] = array2[count2];
				count2++;
			}
		}

		return array;
	}

	private static int getSingle(int[] array) {
		int max = -1;
		int res = 0;
		for (int i = 0; i < array.length; i++) { // find the maximum value
			if (array[i] > max) {
				max = array[i];
			}
		}
		int[] arrayCounter = new int[max + 1]; // create an array of length maximum
		for (int i = 0; i < array.length; i++) { // Add 1 to new array in the index of the integer found
			arrayCounter[array[i]]++;
		}
		for (int i = 0; i < arrayCounter.length; i++) { // The single value is where the is a 1, the value is the index
														// itself
			if (arrayCounter[i] == 1) {
				res = i;
				break;
			}
		}
		return res;
	}

	private static boolean hasOnlyUnique(String s) {
		char[] charArray = new char[s.length() + 1]; // Array of characters
		for (int i = 0; i < s.length(); i++) {
			charArray[i] = s.charAt(i);
		} // Fill the array with every character
		int max = -1;
		for (int i = 0; i < s.length(); i++) {
			if (charArray[i] > max) {
				max = charArray[i]; // See the maximum int value for the character
			}
		}
		int[] arrayCounter = new int[max + 1]; // Same logic as getSingle: I associate a counter
												// to the value of the character
		for (int i = 0; i < s.length(); i++) {
			arrayCounter[charArray[i]]++;
		}
		boolean res = true;
		for (int i = 0; i < max + 1; i++) {
			if (arrayCounter[i] > 1) {
				res = false;
				break;
			}
		}
		return res;
	}

//Create 2 arrays with chars and compare their counters, the have to be the same for every word!!
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] arrayChar1 = new char[s.length()];
		char[] arrayChar2 = new char[t.length()];
		for (int i = 0; i < s.length(); i++) {
			arrayChar1[i] = s.charAt(i);
			arrayChar2[i] = t.charAt(i);
		}
		int max1 = -1;
		int max2 = -1;
		for (int i = 0; i < s.length(); i++) {
			if (arrayChar1[i] > max1) {
				max1 = arrayChar1[i];
			}
			if (arrayChar2[i] > max2) {
				max2 = arrayChar2[i];
			}
		}
		if (max1 != max2) {
			return false;
		}
		int[] arrayCounter1 = new int[max1 + 1];
		int[] arrayCounter2 = new int[max2 + 1];
		for (int i = 0; i < s.length(); i++) {
			arrayCounter1[arrayChar1[i]]++;
			arrayCounter2[arrayChar2[i]]++;
		}
		boolean res = true;
		for (int i = 0; i < max1 + 1; i++) {
			if (arrayCounter1[i] != arrayCounter2[i]) {
				res = false;
				break;
			}
		}
		return res;
	}

	private static int stringToInt(String s) {
		if (s == "1") {
			return 1;
		} else
			return 0;
	}
}
