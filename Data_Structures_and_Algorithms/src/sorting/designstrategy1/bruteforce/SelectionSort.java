package sorting.designstrategy1.bruteforce;

public class SelectionSort {

	public static int[] selectionSort(int[] numbersToBeSorted) {
		/*
		 * Iterate over the every element in the array
		 */
		for (int i = 0; i < numbersToBeSorted.length; i++) {
			/*
			 * Assume the smallest element index is the ith element of the
			 * iteration and store it in variable minindex and its value in
			 * minvalue
			 */
			int minvalue = numbersToBeSorted[i];
			int minindex = i;
			/*
			 * Iterate over the remaining (numbersToBeSorted.length-1-i)
			 * elements and keep updating the min variable
			 */
			for (int red = i + 1; red < numbersToBeSorted.length; red++) {
				if (numbersToBeSorted[red] < minvalue) {
					minvalue = numbersToBeSorted[red];
					minindex = red;
				}
			}
			/*
			 * swap the element in ith position with element in min position
			 */
			numbersToBeSorted[minindex] = numbersToBeSorted[i];
			numbersToBeSorted[i] = minvalue;
		}
		/*
		 * return the sorted array
		 */
		return numbersToBeSorted;
	}

	public static void main(String[] args) {

		int[] sortednumbers = selectionSort(new int[] { 3, 1, 2, 8, 4, 5 });
		for (int i : sortednumbers) {
			System.out.println(i);
		}

	}

}
