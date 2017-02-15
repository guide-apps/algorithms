package utils.sorts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import sorts.InsertionSort;
import sorts.SelectionSort;
import sorts.SortAlgorithm;
import sorts.SortType;
import utils.benchmark.Benchmark;

public class SortExecutor {
	private static Map<SortType, SortAlgorithm> sortAlgorithms = new HashMap<>();
	static {
		sortAlgorithms.put(SortType.SELECTION, new SelectionSort());
		sortAlgorithms.put(SortType.INSERTION, new InsertionSort());
	}
	
	public static void main(String [] args) {
		Integer[] arrayOfIntsBase = SortUtils.randomArray(50000);
		
		SortExecutor.execBenchmark(SortType.SELECTION, Arrays.copyOf(arrayOfIntsBase, 50000));
		SortExecutor.execBenchmark(SortType.SELECTION, Arrays.copyOf(arrayOfIntsBase, 50000));
		SortExecutor.execBenchmark(SortType.INSERTION, Arrays.copyOf(arrayOfIntsBase, 50000));
		SortExecutor.execBenchmark(SortType.INSERTION, Arrays.copyOf(arrayOfIntsBase, 50000));
	}
	
	public static void exec(SortType type, Integer[] arrayToSort) {
		sortAlgorithms.get(type).sort(arrayToSort);
	}
	
	public static void execBenchmark(SortType type, Integer[] arrayToSort) {
		Benchmark.computeMili(() -> sortAlgorithms.get(type).sort(arrayToSort));
	}
	
}
