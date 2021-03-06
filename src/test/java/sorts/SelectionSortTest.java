package sorts;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import utils.sorts.SortExecutor;
import utils.sorts.SortUtils;

public class SelectionSortTest {

	private Integer[] orederedArray = SortUtils.orderedArray(1000);
	private Integer[] randomArray = SortUtils.randomArray(1000);
	
	@Test
	public void valid() {
		final Integer[] array = SortUtils.randomArray(1000);
		
		SortExecutor.exec(SortType.SELECTION, array);
		
		assertThat(orederedArray).isEqualTo(array);
		assertThat(orederedArray).isNotEqualTo(randomArray);
	}
	
}
