package sorts;

public class InsertionSort implements SortAlgorithm {

	@Override
	public void sort(final Integer[] array) {
		for (int i = 0; i < array.length-1; i++) {
			orderSubArray(array, i, array[i+1]);
		}
	}
	
	public void orderSubArray(final Integer[] array, int shiftPosition, int key) {
		for (int j = shiftPosition; j >= 0 && array[j] > key; array[j--] = key) {
			array[j+1] = array[j];
		}
	}

}
