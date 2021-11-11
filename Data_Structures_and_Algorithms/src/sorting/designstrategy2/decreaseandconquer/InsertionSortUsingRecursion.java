package sorting.designstrategy2.decreaseandconquer;

public class InsertionSortUsingRecursion {

	public static void insertionSort1(int[] numbersToBeSorted) {

		insertionSorthelper1(numbersToBeSorted, numbersToBeSorted.length);
	}

	public static void insertionSort2(int[] numbersToBeSorted) {

		insertionSorthelper2(numbersToBeSorted, numbersToBeSorted.length);
	}

	/*
	 * swapping is done
	 */
	private static void insertionSorthelper1(int[] numbersToBeSorted, int size) {
		if (size <= 1)
			return;
		insertionSorthelper1(numbersToBeSorted, size - 1);
		int rightptr = size - 1;
		while (rightptr >= 1 && numbersToBeSorted[rightptr - 1] > numbersToBeSorted[rightptr]) {
			int temp = numbersToBeSorted[rightptr - 1];
			numbersToBeSorted[rightptr - 1] = numbersToBeSorted[rightptr];
			numbersToBeSorted[rightptr] = temp;
			rightptr--;
		}
	}

	/*
	 * Value is copied to temp variable
	 */
	private static void insertionSorthelper2(int[] numbersToBeSorted, int size) {
		if (size <= 1)
			return;
		insertionSorthelper1(numbersToBeSorted, size - 1);
		int rightptr = size - 1;
		int valueToBeInserted = numbersToBeSorted[rightptr];
		while (rightptr >= 1 && numbersToBeSorted[rightptr - 1] > valueToBeInserted) {
			numbersToBeSorted[rightptr] = numbersToBeSorted[rightptr - 1];
			rightptr--;
		}
		numbersToBeSorted[rightptr] = valueToBeInserted;
	}

	public static void main(String[] args) {
		int[] numbers = (new int[] { 7, 3, 1, 2, 8, 4, 5 });

		System.out.println("Method 1");
		insertionSort1(numbers);
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("Method 2");
		insertionSort2(numbers);
		for (int i : numbers) {
			System.out.println(i);
		}
	}

}
