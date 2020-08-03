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
		if(value==0) {
			return value;
		}
		else if(value==1) {
			return  '0' + '1';
		}
		else {
			long Fib=0;
			long x1=1, x2 =1, x0=0;
			while(value>=Fib && value!=0 &&value!=1) {
				Fib=x1+x2;
				x0=x1;
				x1=x2;
				x2=Fib;
			}
			if(value==Fib) {
				return x0 & x1 ;
			}
			else {
				return 0;
			}
		}
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