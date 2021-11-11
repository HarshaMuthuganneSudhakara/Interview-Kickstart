package sorting.designstrategy3.divideandconquer;

import java.util.ArrayList;
import java.util.List;

public class MergeSort_ListInput_ExtraSpace {

	private static void mergeSort(List<Integer> arraylist) {

		mergeSorthelper(arraylist, arraylist.size());
	}

	private static void mergeSorthelper(List<Integer> arrlist, int arrlistlen) {

		// check for base condition
		if (arrlistlen < 2)
			return;

		// calculate mid element
		int mid = arrlistlen / 2;

		// create a left array of length mid
		List<Integer> leftarr = new ArrayList<>();

		// create a right array of length arrlen-mid
		List<Integer> rightarr = new ArrayList<>();

		// copy the elements present in arr to leftarr and rightarr
		for (int i = 0; i < arrlistlen; i++) {
			if (i < mid)
				leftarr.add(arrlist.get(i));
			else {
				rightarr.add(arrlist.get(i));
			}
		}

		// make a recursive call using leftarr
		mergeSorthelper(leftarr, leftarr.size());

		// make a recursive call using rightarr
		mergeSorthelper(rightarr, rightarr.size());

		// merge leftarr and rightarr
		merge(leftarr, rightarr, arrlist, leftarr.size(), rightarr.size());
	}

	public static void merge(List<Integer> leftarr, List<Integer> rightarr, List<Integer> arrlist, int leftsize,
			int rightsize) {

		int l = 0, r = 0;
		arrlist.clear();
		while (l < leftsize && r < rightsize) {
			if (leftarr.get(l) < rightarr.get(r))
				arrlist.add(leftarr.get(l++));
			else
				arrlist.add(rightarr.get(r++));
		}

		while (l < leftsize)
			arrlist.add(leftarr.get(l++));

		while (r < rightsize)
			arrlist.add(rightarr.get(r++));
	}

	public static void main(String[] args) {
		// Input List to Test
		List<Integer> arraylist = new ArrayList<>();
		arraylist.add(12);
		arraylist.add(13);
		arraylist.add(10);
		arraylist.add(-12);
		arraylist.add(5);
		arraylist.add(-15);
		arraylist.add(45);

		// Call the mergeSort function
		mergeSort(arraylist);

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.print(arraylist.get(i) + " ");
		}

	}

}
