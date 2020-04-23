package Array.w3resource;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysProgram4From20 {
	public static void main(String[] args) {
		// sort numeric and string array
		int num[] = { 1, 22, 44, 55, 11, 22 };
		String str[] = { "Oh", "my", "god" };
		Arrays.sort(num);
		Arrays.sort(str);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));

		//convert array to arraylist
		ArrayList<String>list=new ArrayList<>(Arrays.asList(str));
		

		System.out.println(list);
		
		//convert list ot array
		ArrayList<String>list1=new ArrayList<>();
		list1.add("12");
		list1.add("34");
		list1.add("54");
		list1.add("64");
		list1.add("94");
		list1.add("80");
		System.out.println("LIST "+list);
		String arr[]=new String[list.size()];
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
