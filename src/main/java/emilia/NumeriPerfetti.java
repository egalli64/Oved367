package emilia;

public class NumeriPerfetti {

	
	public static boolean isPrime (int value) {
		boolean perfect= false;
		
			if (value>0 && value%2!=0) {
				for (int i = 2; i<=value/2; i++) {
					if(value%i==0) {
						perfect = false;
					}else {
						perfect = true;				}
			}
		}
		
		return perfect;
	}
	
	public static boolean isPerfect (int value) {
		boolean perfect = false;
		int sum=0;
		if(value>0) {
		for(int i=1; i<value;i++) {
			if(value%i==0) {
				sum+=i;
			}
		}
		}else {
			perfect = false;
		}
		if(sum==value) {
			perfect = true;
		}else {
			perfect = false;
		}
		return perfect;
	
}
	public static boolean isAbudant(int value) {
		boolean abudant = false;
		int sum=0;
		if(value<0) {
			return false;
		}else {
		for(int i=1; i<value;i++) {
			if(value%i==0) {
				sum+=i;
			}
		}
		}
		
		if(sum>value) {
			abudant = true;
		}else {
			abudant = false;
		}
		return abudant;
	
}
	
	public static boolean isDeficient(int value) {
		boolean deficient = false;
		int sum=0;
		if(value>0) {
		for(int i=1; i<value;i++) {
			if(value%i==0) {
				sum+=i;
			}
		}
		}else {
			deficient=false;
		}
		if(sum<value) {
			deficient = true;
		}else {
			deficient = false;
		}
		return deficient;
	
}
	
}

