package luigi;

public class EngineCapacity {
	 /**
     * Engine capacity
     * 
     * @param bore   in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
    	double powBorecm = Math.pow(bore/20, 2);
        double strokecm = stroke/20;
        return powBorecm * Math.PI * strokecm;
    }
}