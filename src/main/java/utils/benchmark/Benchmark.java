package utils.benchmark;

import java.util.function.Supplier;

import sorts.InsertionSort;
import sorts.SelectionSort;
import utils.sorts.SortUtils;

public class Benchmark {

	public static void main(String[] args) {
		Benchmark.computeNano(() -> new SelectionSort().sort(SortUtils.randomArray(10000)));
		Benchmark.computeNano(() -> new InsertionSort().sort(SortUtils.randomArray(10000)));
	}
	
	public static long computeNano(BenchmarkExecutor executor) {
		return Benchmark.compute(executor, System::nanoTime);
	}
	
	public static long computeMili(BenchmarkExecutor executor) {
		return Benchmark.compute(executor, System::currentTimeMillis);
	}
	
	private static long compute(BenchmarkExecutor executor, Supplier<Long> sysout) {
		final long start = sysout.get();
		executor.exec();
		final long end = sysout.get();
		final long timeElapsed = end - start;
		
		System.out.format("Time elapsed: %d\n", timeElapsed);
		return timeElapsed;
	}
	
}
