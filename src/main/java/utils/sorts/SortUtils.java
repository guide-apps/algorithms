package utils.sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUtils {
	
	public static Integer[] randomArray(final int size) {
		final Integer[] orderedArray = orderedArray(size);
		
		final List<Integer> orderedList = Arrays.asList(orderedArray);
		Collections.shuffle(orderedList);
		
		return orderedList.toArray(new Integer[0]);
	}

	public static Integer[] orderedArray(final int size) {
		final Integer[] array = new Integer[size];
		for (int i = 0; i < size; i++) {
			array[i] = i + 1;
		}
		return array;
	}
	
}
