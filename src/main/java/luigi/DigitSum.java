package luigi;

public class DigitSum {
	/**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
    	int valueabs = Math.abs(value); 
    	int sum = 0;
    	while (valueabs!= 0) {
    		sum = sum + valueabs %10;
    		valueabs = valueabs/10;
    	}
    	return sum;
    }
}
