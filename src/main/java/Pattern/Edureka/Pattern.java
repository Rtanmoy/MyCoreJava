package Pattern.Edureka;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Pattern ==> 1 : Pyramid");
		int n = 5;
		for (int i = 1; i <= n; i++) // outer loop for number of rows(n)
		{
			for (int j = n - i; j >= 1; j--) // inner loop for spaces
			{
				System.out.print(" "); // print space
			}
			for (int j = 1; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		}
		System.out.println("Pattern ==> 2 : Right Triangle");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Pattern ==> 3 : Left Triangle");
		for (int i = n; i >= 1; i--) {
			// Printing i spaces at the beginning of each row

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Printing i to rows value at the end of each row

			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("Pattern ==> 4 : Diamond Shape");
		for (int i = 1; i <= n; i++) // outer loop for number of rows(n)
		{
			for (int j = n - i; j >= 1; j--) // inner loop for spaces
			{
				System.out.print(" "); // print space
			}
			for (int j = 1; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		}
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n - 1 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pattern ==> 5 : Triangle Star");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
