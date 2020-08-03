package francesco;

public class Hello {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hello.isAnagram("tommarvoloriddle", "iamlordvoldemort"));
	}
}
