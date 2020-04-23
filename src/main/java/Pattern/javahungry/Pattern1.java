package Pattern.javahungry;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Another Pattern == >> 1");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 2");
		// pattern in reverse order
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 3");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 4");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println("Another Pattern == >> 5");
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 6");
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 7");
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j-- ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 8");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
