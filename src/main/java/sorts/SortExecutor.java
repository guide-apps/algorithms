package sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortExecutor {
	private static Map<SortType, SortAlgorithm> sortAlgorithms = new HashMap<>();
	static {
		sortAlgorithms.put(SortType.SELECTION, new SelectionSort());
		sortAlgorithms.put(SortType.INSERTION, new InsertionSort());
	}
	
	public static void main(String [] args) {
		Integer[] arrayOfIntsOne = SortExecutor.randomArray(30000);
		Integer[] arrayOfIntsTwo = SortExecutor.randomArray(30000);
		
		SortExecutor.exec(SortType.SELECTION, arrayOfIntsOne);
		SortExecutor.exec(SortType.SELECTION, arrayOfIntsTwo);
//		SortExecutor.exec(SortType.INSERTION, arrayOfIntsOne);
//		SortExecutor.exec(SortType.INSERTION, arrayOfIntsTwo);
	}
	
	public static void exec(SortType type, Integer[] array) {
		final Integer[] cloneArray = Arrays.copyOf(array, array.length);
		
		final SortAlgorithm algorithm = sortAlgorithms.get(type);
		
		long start = System.currentTimeMillis();
		algorithm.sort(cloneArray);
		long end = System.currentTimeMillis();
		
		System.out.println(String.format("%s Execution time: %d", type, (end-start)));
	}
	
	public static Integer[] randomArray(final int size) {
		final List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
		    list.add(i + 1);
		}
		
		Collections.shuffle(list);
		final Integer[] array = list.toArray(new Integer[0]);
		
		return array;
	}
	
}
