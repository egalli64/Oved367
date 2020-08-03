package giulia;

public class EserciziOperatori {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		// check parameters
		if (time < 0 || distance < 0) {
			return -1.0; // 1.0 così è chiaro che sia un double
		}

		// speed
		double speed = distance / time; // se time = 0 java restituisce infinito
		return speed;
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
		return Math.sqrt(Math.pow((x1 - x0), 2) - Math.pow((y1 - y0), 2));
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
		double borecm = bore / 10;
		double strokecm = stroke / 10;
		double volumecm = Math.pow(borecm / 2, 2) * Math.PI * strokecm;
		return volumecm * nr;

	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		int sum = 0;

		while (value != 0) {
			sum = sum + Math.abs(value) % 10;
			value = value / 10;
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
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		int result = 0;

		if (d <= 1) {
			result = 10;
		} else if (d > 1 && d <= 5) {
			result = 5;
		} else if (d > 5 && d <= 10) {
			result = 10;
		} else {
			result = 0;
		}
		return result;
	}
}