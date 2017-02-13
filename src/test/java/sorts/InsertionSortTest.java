package sorts;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class InsertionSortTest {

	private Integer[] orederedArray = SortUtils.orderedArray(15);
	private Integer[] randomArray = SortUtils.randomArray(15);
	
	@Test
	public void valid() {
		final Integer[] array = SortUtils.randomArray(15);
		
		SortExecutor.exec(SortType.INSERTION, array);
		
		assertThat(array).isEqualTo(orederedArray);
		assertThat(array).isNotEqualTo(randomArray);
	}
	
}
