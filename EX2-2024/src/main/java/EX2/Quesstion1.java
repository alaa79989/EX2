package EX2;
public class Quesstion1 {
	    public static String calc_roots(int a, int b, int c) {
	 
	    	if (a == 0) {
	            return "Not a quadratic equation.";
	        }
	        if (a < 5 || a > 200 || b < 5 || b > 200 || c < 5 || c > 200) {
	            return "a not in range|| b not in range||c not in range";
	        }
	        double determinant = b * b - 4 * a * c;
	        if (determinant < 0) {
	            return "imaginary roots";
	        } else if (determinant == 0) {
	            return "Equal roots";
	        } else {
	            return "real roots";
	        }
	    }
	}

