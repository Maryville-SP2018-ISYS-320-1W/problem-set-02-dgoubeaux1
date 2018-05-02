/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		double a, b, c;
		a = 8;
		b = 5.2;
		c = 7.1;
		result = triangleArea (a, b, c);
		
			System.out.println(result);
	}
	
		public double triangleArea(double a, double b, double c) {
		    double s = (a + b + c) / 2;
		    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		}
	}


