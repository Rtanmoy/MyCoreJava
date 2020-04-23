package String.w3resource;

public class StringProgramFrom32 {

	public static void main(String[] args) {

		String str = "Madam";
		String str1 = str.toLowerCase();
		if (isPalimdrom(str1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static boolean isPalimdrom(String str1) {
		int i = 0, j = str1.length() - 1;
		while (i < j) {
			if (str1.charAt(i) != str1.charAt(j)) {
				i++;
				j--;
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

}
