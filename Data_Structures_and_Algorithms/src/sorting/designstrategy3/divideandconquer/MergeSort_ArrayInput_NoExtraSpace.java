package sorting.designstrategy3.divideandconquer;

public class MergeSort_ArrayInput_NoExtraSpace {

	private static void mergeSort(int[] array) {

		mergeSorthelper(array, 0, array.length - 1);
	}

	private static void mergeSorthelper(int[] arr, int start, int end) {

		if (start < end) {

			int mid = start + (end - start) / 2;
			
			System.out.println("mid = "+mid);
			
			mergeSorthelper(arr, start, mid);

			mergeSorthelper(arr, mid + 1, end);

			merge(arr, start, mid, mid + 1, end);
		}
	}

	public static void merge(int[] arr, int leftstart, int leftend, int rightstart, int rightend) {

		while (leftstart <= leftend && rightstart <= rightend) {
			int leftvalue = arr[leftstart];
			int rightvalue = arr[rightstart];
			if (leftvalue <= rightvalue)
				leftstart++;
			else {
				// shift all elements one position to rightstart
				int movpos = rightstart;
				while (movpos < leftstart) {
					arr[movpos] = arr[movpos - 1];
					movpos--;
				}

				arr[leftstart] = rightvalue;
				leftstart++;
				rightstart++;
				leftend++;
			}
		}

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