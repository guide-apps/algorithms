package sorts;

import java.util.Arrays;

public class SortExecutor {

	public static void main(String [] args) {
		Integer [] arrayOfIntsOne = {87, 56, 4, 78, 23, 2, 1};
		Integer [] arrayOfIntsTwo = {99, 64, 9, 1, 100, 4, 45};
		
		SortExecutor.exec(SortType.SELECTION_SORT, arrayOfIntsOne);
		SortExecutor.exec(SortType.SELECTION_SORT, arrayOfIntsTwo);
	}
	
	public static void exec(SortType type, Integer [] array) {
		
		long start = System.currentTimeMillis();
		switch (type) {
		case SELECTION_SORT:
			new SelectionSort().sort(array);
			break;
		default:
			break;
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start));
		System.out.format("Execution time: %d - %s \n", (end-start), Arrays.toString(array));
	}
	
	enum SortType {
		SELECTION_SORT;
	}
}
