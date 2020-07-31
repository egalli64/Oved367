package federico;

public class S02 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     *      or -infinite if time or distance are negative
     */
    public static double speed(double distance, double time) {
    	if ((time<0)||(distance<0)) {
    		System.out.println("Non consistent input");
    		return Double.NEGATIVE_INFINITY;
    	}
    	else {
    		return distance / time;
    	}
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
    	if ((x0==x1)&&(y0==y1)) {
    		return 0;
    	} else {
    		return Math.sqrt(Math.pow((y0-y1),2)+Math.pow((x0-x1),2));
    	}
    }

    /**
     * Engine capacity
     * 
     * @param bore   in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
    	if ((bore<0)||(stroke<0)||(nr<1)) {
    		System.out.println("Non consistent input");
			return Double.NEGATIVE_INFINITY;
    	} else {
    		return (Math.pow(bore/2, 2)*Math.PI*stroke*nr)/1000;
    	}
    }

    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
    	int count = 0;
    	if (value < 0) {
    		value = -value;
    	}
    	while (value > 0) {
    		count += value%10;
    		value /= 10;
    	}	
        return count;
    }

    /**
     * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
     *
     * @param x
     * @param y
     *
     * @return
     */
    public static int score(double x, double y) {
    	double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    	if (distance <= 1) {
    		return 10;
    	} else if (distance <= 5) {
    		return 5;
    	} else if (distance <= 10) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
}
