package java8.streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import org.junit.Test;

public class ParallelStreamsApiTest {
	
	@Test
	public void giveRangeOfLongsSummedInParallel() throws InterruptedException, ExecutionException {
		long firstNum = 1;
	    long lastNum = 1_000_000;
	    final ForkJoinPool customThreadPool = new ForkJoinPool(4);
	    
	    List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed()
	    	      .collect(Collectors.toList());
	    
	    final Long reduceDefault = aList.parallelStream().reduce(0L, Long::sum);
	    final Long reduceCustom = customThreadPool.submit(() -> aList.parallelStream().reduce(0L, Long::sum)).get();
	    
	    assertThat(reduceDefault).isEqualTo(((lastNum + firstNum) * lastNum / 2));
	    assertThat(reduceCustom).isEqualTo(((lastNum + firstNum) * lastNum / 2));
	}
}
