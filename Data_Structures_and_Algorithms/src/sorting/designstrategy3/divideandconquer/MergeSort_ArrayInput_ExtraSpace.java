package sorting.designstrategy3.divideandconquer;

public class MergeSort_ArrayInput_ExtraSpace {

	private static void mergeSort(int[] array) {

		mergeSorthelper(array, array.length);
	}

	private static void mergeSorthelper(int[] arr, int arrlen) {

		// check for base condition
		if (arrlen < 2)
			return;

		// calculate mid element
		int mid = arrlen / 2;

		// create a left array of length mid
		int[] leftarr = new int[mid];

		// create a right array of length arrlen-mid
		int[] rightarr = new int[arrlen - mid];

		// copy the elements present in arr to leftarr and rightarr
		int k = 0;
		for (int i = 0; i < arrlen; i++) {
			if (i < mid)
				leftarr[i] = arr[i];
			else {
				rightarr[k] = arr[i];
				k++;
			}
		}

		// make a recursive call using leftarr
		mergeSorthelper(leftarr, leftarr.length);

		// make a recursive call using rightarr
		mergeSorthelper(rightarr, rightarr.length);

		// merge leftarr and rightarr
		merge(leftarr, rightarr, arr, mid, arrlen - mid);
	}

	public static void merge(int[] leftarr, int[] rightarr, int[] arr, int leftsize, int rightsize) {

		int i = 0, l = 0, r = 0;

		while (l < leftsize && r < rightsize) {
			if (leftarr[l] < rightarr[r])
				arr[i++] = leftarr[l++];
			else
				arr[i++] = rightarr[r++];
		}

		while (l < leftsize)
			arr[i++] = leftarr[l++];

		while (r < rightsize)
			arr[i++] = rightarr[r++];
	}

	public static void main(String[] args) {
		// Input Array to Test
		int[] array = { 12, 1, 10, 50, 5, 15, 45 };

		// Call the mergeSort function
		mergeSort(array);

		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}

	}

}