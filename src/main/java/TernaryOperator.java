
public class TernaryOperator {
	public static void main(String[] args) {
		int a = 2, b = 3, c = 1, result1, temp;
		if (a < b && c< b) {
			System.out.println("b is leargest");
		} else if (b<a && b<c) {
			System.out.println("b is leargest");
		} else {
			System.out.println("c is leargest ");
		}
		String result = a < b ? "a is less than b" : "b is less than a";
		System.out.println(result);
		//smalest
		temp = a < b ? a : b;
		result1 = c < temp ? c : temp;
		System.out.println(result1);
		
		//biggest
		int temp1=c>(a>b?a:b)?c:(a>b?a:b);
		int result2=c>temp?c:temp;
		System.out.println(temp1);

	}
}
