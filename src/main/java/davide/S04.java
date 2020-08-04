package davide;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		int s = 0;
		if (last<first) {
			return 0;
		}
		else {
			int i=0;
			for (i=first;i<=last;i++) {
				s=s+i;
			}
		}
		
		return s;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		int s = 0;
		if (last<first) {
			return 0;
		}
		else {
			int i=0;
			for (i=first;i<=last;i++) {
				if(i%2==0) {
				s=s+i;
				}
			}
		}
		
		return s;
	}

	/**
	 * Square root using Newton method
	 * Epsilon should be set to 0.001
	 *  
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
	    
	    return 0.0;
	}

	/**
     * Square root using Newton method
     * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
    public static double sqrt(double value, double epsilon) {
    	double preValue=0.0;
    	double i=0.0;
       do {
    	   i=preValue;
    	   if(i==0.0) {
    		   preValue=value/2;
    		   
    	   }
    	   preValue= (preValue + value/preValue)/2;
    	   	
        }while(preValue-i<=epsilon);
        return preValue ;
    }
	
	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		int fact=0;
		for(int i=0;i<=value;i++) {
			if(i==0) {
				fact=1;
			}
			else {
				fact=fact*i;
			}
		}
		return fact;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		long fibon;
		if (value < 0) {
			fibon = 0;
		} else if (value == 0) {
			fibon = 0;
		} else if (value == 1){
			fibon = 1;
		} else {
			fibon = fibonacci(value-2) + fibonacci(value-1);
		}
		return fibon;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		
		for(int i=0;i<value;i++) {
			for(int j=0;j<value;j++) {
				result[i][j]=(i+1)*(j+1);
			}			
		}
		
		return result;
	}
}