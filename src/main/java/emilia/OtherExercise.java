package emilia;

import java.util.Arrays;

public class OtherExercise {

	public static boolean isArmstrong(int value) {
		int sum=0;
		int count = 0;
		
		int tempvalue=value;
		
		while (tempvalue!=0) {
    		count++;
			tempvalue = tempvalue/10;	
    	}
		
		tempvalue = value;
		
		while (tempvalue!=0) {
			int i = tempvalue%10;
			sum+=Math.pow(i,count);
			tempvalue=tempvalue/10;
		}
		
		if(sum == value) {
			return true;
		}else {
		
		return false;
	}
}
	public static boolean isPangram(String s) {
		boolean [] alphabet = new boolean[26];
		Arrays.fill(alphabet, false); //initialize with false value
		boolean pangram = false; 
		int alphaindex = 0;
		
		s = s.toUpperCase(); //convert all letters to upper letters 
		
		for (int i=0; i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				alphaindex = s.charAt(i)-'A'; 
				alphabet[alphaindex] = true;
		}
	}
		
		for(boolean i : alphabet) {
			if (!i) {		
				pangram = false;
			}else {
				pangram = true;
			}
		}
		
		
		return pangram;
	}
	
	//Hamming distance example between two strings
	
	public static int hammingDistance (char s1[], char s2[]) {
		int count = 0;
		if(s1.length!=s2.length) {
			System.out.println("The strings haven't the same length, it's impossible to calculate the hamming distance");
			return -1;
		}else {
			for(int i=0; i<s1.length;i++) {
				if(s1[i]!=s2[i]) {
					count++;
				}
			}
	}
		return count;
}

}