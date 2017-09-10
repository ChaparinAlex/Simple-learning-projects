package labs;

public class GravityCalculator {
    private final double A = 9.81;
    
    public double calcDist(double t){
    	return A*Math.pow(t, 2)/2;
    }
}
