package count;

public class PyramidPattern {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n; i++) // outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for
								// spaces
		{
			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		}
	}
}
