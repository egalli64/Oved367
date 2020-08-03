package luigi;

public class Distance {
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

		return Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));	 
	}
}	 	    
