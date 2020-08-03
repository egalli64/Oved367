package francesco;

public class S02 {

	public static double speed(double distance, double time) {
		if (distance < 0 || time < 0) {
			return -1;
		} else {
			return distance / time;
		}
	}

	public static double distance(int x0, int y0, int x1, int y1) {
		double deltax = x0 - x1;
		double deltay = y0 - y1;
		return Math.sqrt(deltax * deltax + deltay * deltay);
	}

	public static double engineCapacity(double bore, double stroke, double nr) {
		double area = Math.PI * bore * bore / 4;
		return area * stroke * nr / 1000;
	}

	public static int digitSum(int value) {
		int temp = 0;
		value = Math.abs(value);
		int lastDigit = 0;
		for (;;) {
			if (value == 0) {
				break;
			}
			lastDigit = value % 10;
			temp += lastDigit;
			value = (value - lastDigit) / 10;
		}
		return temp;
	}

	public static int score(double x, double y) {
		double dist = Math.sqrt(x * x + y * y);
		if (dist <= 1) {
			return 10;
		} else if (dist <= 5) {
			return 5;
		} else if (dist <= 10) {
			return 1;
		} else
			return 0;
	}
}
