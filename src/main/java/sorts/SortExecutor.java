package sorts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortExecutor {
	private static Map<SortType, SortAlgorithm> sortAlgorithms = new HashMap<>();
	static {
		sortAlgorithms.put(SortType.SELECTION, new SelectionSort());
		sortAlgorithms.put(SortType.INSERTION, new InsertionSort());
	}
	
	public static void main(String [] args) {
		Integer[] arrayOfIntsBase = SortUtils.randomArray(50000);
		
		SortExecutor.exec(SortType.SELECTION, Arrays.copyOf(arrayOfIntsBase, 50000));
		SortExecutor.exec(SortType.SELECTION, Arrays.copyOf(arrayOfIntsBase, 50000));
		SortExecutor.exec(SortType.INSERTION, Arrays.copyOf(arrayOfIntsBase, 50000));
		SortExecutor.exec(SortType.INSERTION, Arrays.copyOf(arrayOfIntsBase, 50000));
	}
	
	public static void exec(SortType type, Integer[] arrayToSort) {
		
		final SortAlgorithm algorithm = sortAlgorithms.get(type);
		
		long start = System.currentTimeMillis();
		algorithm.sort(arrayToSort);
		long end = System.currentTimeMillis();
		
		System.out.println(String.format("%s Execution time: %d", type, (end-start)));
	}
	
}
