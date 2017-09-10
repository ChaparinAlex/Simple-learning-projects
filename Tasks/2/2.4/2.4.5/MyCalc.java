package labs;

public class MyCalc {
    public static double calcPI(int n){
    	double res = 0.0;
    	for (int i = 0; i < n; i++){
    		res += Math.pow(-1, i)*4/(2*i + 1);
    	}
    	return res;
    }
}
