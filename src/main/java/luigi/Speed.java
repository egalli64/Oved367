package luigi;

public class Speed {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
        return distance / time;
    }
}