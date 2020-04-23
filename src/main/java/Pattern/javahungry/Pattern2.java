package Pattern.javahungry;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Another Pattern == >> 9");
		for (int i =n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <=n; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 10");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 11");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + "");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 12");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 13");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 14");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n - i; j++) {
				System.out.print("1");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 15");
		for (int i = 1; i <= n; i++) {
			int num;
			if (i % 2 == 0) {
				num = 0;
				for (int j = 1; j <= n; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
			} else {
				num = 1;

				for (int j = 1; j <= n; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
			}
			System.out.println();
		}
		System.out.println("Another Pattern == >> 16");
		for (int i = 1; i <=n; i++) 
        {
            int num = i;
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
                num = num+=n-j;
            }
            System.out.println();
        }
		System.out.println("Another Pattern == >> 17");
		  for(int i=1;i<=n ;i++)
	        {
	            for(int j=i; j <=n ;j++)
	            {
	                System.out.print(j + " ");
	            }
	            for(int k=1; k < i ;k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
		  System.out.println("Another Pattern == >> 18");
		  int value=1;
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print(value+" ");
				  value++;
			  }
			  System.out.println();
		  }
		  System.out.println("Another Pattern == >> 19");
		  for(int i=1;i<=n;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print(i+"");
			  }
			  System.out.println();
		  }
	}
}
