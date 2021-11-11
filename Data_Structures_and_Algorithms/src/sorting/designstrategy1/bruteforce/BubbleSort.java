package sorting.designstrategy1.bruteforce;

public class BubbleSort {

	public static int[] bubbleSort(int[] numbersToBeSorted) {
		/*
		 * number of iterations
		 */
		for (int i = 0; i < numbersToBeSorted.length; i++) {
			/*
			 * Iterate from right to left till i
			 */
			for (int j = numbersToBeSorted.length-1; j > i; j--) {
				/*
				 * compare adjacent values
				 */
				if (numbersToBeSorted[j] < numbersToBeSorted[j - 1]) {
					/*
					 * swap if comparison condition turns true
					 */
					int temp = numbersToBeSorted[j];
					numbersToBeSorted[j] = numbersToBeSorted[j - 1];
					numbersToBeSorted[j - 1] = temp;
				}
			}
		}
		/*
		 * return resulted array
		 */
		return numbersToBeSorted;
	}

	public static void main(String[] args) {
		int[] sortednumbers = bubbleSort(new int[] { 3, 1, 2, 8, 4, 5 });
		for (int i : sortednumbers) {
			System.out.println(i);
		}

	}

}
