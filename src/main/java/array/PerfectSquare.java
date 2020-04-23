package array;

public class PerfectSquare {
	static boolean perfectSqare(double x) {
		double sq=Math.sqrt(x);
		return(sq==Math.floor(sq));
	}

	public static void main(String[] args) {
		
		if(perfectSqare(9)) {
			System.out.println("Perfect squere");
		}else {
			System.out.println("Not perfect squere");
		}

	}

}
