package luigi;

public class Score {
	 /**
     * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
     *
     * @param x
     * @param y
     *
     * @return
     */
    public static int score(double x, double y) {
    	double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    	int result = 0;
    	if (d<=1)
    		result = 10;
    	else result = 5;
    	return 30;
    }
}
    	