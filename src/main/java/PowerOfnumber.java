
public class PowerOfnumber {

	public static void main(String[] args) {

		int n = 2, p = 5;
		long result = 1;
		for (int i = p; i != 0; --i) {
			result *= n;
		}
		System.out.println(result);
		long result1 = 1;
		for (int i = 1; i <= p; i++) {
			result1 *= n;
		}
		System.out.println(result1);
	}

}
