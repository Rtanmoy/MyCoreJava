package Array.w3resource;

import java.util.ArrayList;

public class ArraysProgramFrom37 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(10);
		temp.add(20);
		temp.add(30);
		list.add(new ArrayList<Integer>(temp));
		temp.clear();

		temp.add(50);
		temp.add(60);
		temp.add(70);
		list.add(new ArrayList<Integer>(temp));
		temp.clear();

		temp.add(90);
		temp.add(100);
		temp.add(110);
		list.add(new ArrayList<Integer>(temp));
		temp.clear();
		for (ArrayList<Integer> t : list)
			System.out.println(t);

		ArrayList<ArrayList<Integer>> result = diagonal(list);
		for (ArrayList<Integer> t : result)
			System.out.println(t);

	}

	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> list) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		int N = list.size();
		System.out.println("N==> "+N);
		int i = N - 1;
		while (i >= 0) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			int row = 0, col = N - i - 1;
			for (int j = 0; j < N - i; j++) {
				tmp.add(list.get(row).get(col));
				row++;
				col--;
			}
			ans.add(tmp);
			i--;
		}

		i = N - 2;
		while (i >= 0) {
			int row = N - i - 1, col = N - 1;
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				tmp.add(list.get(row).get(col));
				row++;
				col--;
			}
			ans.add(tmp);
			i--;
		}

		return ans;
	}
}
