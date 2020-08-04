package arianna;

public class S02 {
	
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
    	if (time < 0.0 || distance < 0.0) {
    		return -1;
    	}
        return distance/time;
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
    	double xq = Math.pow((x1 - x0),2);
    	double yq = Math.pow((y1 - y0),2);
    	return Math.sqrt(xq+yq);
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
    	double powRadius = Math.pow(bore/2,2);
        return Math.PI*(powRadius/100)*(stroke/10)*nr;
    }

    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
        int sum = 0;
        value = Math.abs(value);
        
        while(value!=0) {
        	sum += value % 10;
        	value /= 10;
        }
        
        return sum;
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
    	double xq = Math.pow(x,2);
    	double yq = Math.pow(y,2);
    	double distance = Math.sqrt(xq+yq);
    	if (distance <= 1) {
    		return 10;
    	}
    	else if (distance <= 5) {
    		return 5;
    	}
    	else if (distance <= 10) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }
}
