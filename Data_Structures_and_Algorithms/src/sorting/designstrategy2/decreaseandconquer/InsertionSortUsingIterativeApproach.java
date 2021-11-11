package sorting.designstrategy2.decreaseandconquer;

public class InsertionSortUsingIterativeApproach {

	private static void insertionSort(int[] numbers) {
		insertionSorthelper(numbers, numbers.length);
	}

	private static void insertionSorthelper(int[] numbers, int size) {
		if (size <= 1)
			return;
		for (int i = 1; i < numbers.length; i++) {
			int valueToBeInserted = numbers[i];
			int startidx = i;
			while ((startidx >= 1) && numbers[startidx - 1] > valueToBeInserted) {
				numbers[startidx] = numbers[startidx - 1];
				startidx--;
			}
			numbers[startidx] = valueToBeInserted;
		}
	}

	public static void main(String[] args) {
		int[] numbers = (new int[] { 7, 3, 1, 2, 8, 4, 5 });

		insertionSort(numbers);
		for (int i : numbers) {
			System.out.println(i);
		}
	}

	
	
}
