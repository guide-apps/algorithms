package sorts;

import java.util.HashMap;
import java.util.Map;

public class SortExecutor {
	private static Map<SortType, SortAlgorithm> sortAlgorithms = new HashMap<>();
	static {
		sortAlgorithms.put(SortType.SELECTION, new SelectionSort());
		sortAlgorithms.put(SortType.INSERTION, new InsertionSort());
	}
	
	public static void main(String [] args) {
		Integer[] arrayOfIntsOne = SortUtils.randomArray(30000);
		Integer[] arrayOfIntsTwo = SortUtils.randomArray(30000);
		
		SortExecutor.exec(SortType.SELECTION, arrayOfIntsOne);
		SortExecutor.exec(SortType.SELECTION, arrayOfIntsTwo);
	}
	
	public static void exec(SortType type, Integer[] arrayToSort) {
		
		final SortAlgorithm algorithm = sortAlgorithms.get(type);
		
		long start = System.currentTimeMillis();
		algorithm.sort(arrayToSort);
		long end = System.currentTimeMillis();
		
		System.out.println(String.format("%s Execution time: %d", type, (end-start)));
	}
	
}
