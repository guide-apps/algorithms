package java8.streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class StreamsApiTest {

	final String[] arrayOfStrings = new String[] {"Gabriel", "Artur", "Jeison", "Bianca", "Gabriel"};
	
	@Before
	public void setUp() {
		Stream<String> streamOfStrings = Arrays.stream(arrayOfStrings);
	}
	
	@Test
	public void distinct() {
		assertThat(Arrays.stream(arrayOfStrings).distinct().toArray()).contains("Gabriel", "Artur", "Jeison", "Bianca");
		assertThat(Arrays.stream(arrayOfStrings).distinct().count()).isEqualTo(4);
	}
	
	@Test
	public void matchs() {
		assertThat(Arrays.stream(arrayOfStrings).anyMatch(e -> e.contains("Gabriel"))).isTrue();
		assertThat(Arrays.stream(arrayOfStrings).allMatch(e -> e.contains("Gabriel"))).isFalse();
		assertThat(Arrays.stream(arrayOfStrings).noneMatch(e -> e.contains("gabriel"))).isTrue();
	}
	
	@Test
	public void filter() {
		final Stream<String> streamOfStrings = Arrays.stream(arrayOfStrings);
		assertThat(streamOfStrings.filter(e -> e.contains("Gabriel")).count()).isEqualTo(2);
	}
	
	@Test 
	public void map() {
		final Map<String, Integer> streamOfMapLength = Arrays.stream(arrayOfStrings)
				.distinct()
				.map(e -> e.toLowerCase())
				.collect(Collectors.toMap(Function.identity(), String::length));
		
		assertThat(streamOfMapLength.get("gabriel")).isEqualTo(7);
		assertThat(streamOfMapLength.get("artur")).isEqualTo(5);
	}
	
	@Test
	public void collectors() {
		final int sumOfChars = Arrays.stream(arrayOfStrings)
				  .collect(Collectors.summingInt(String::length));
		
		assertThat(sumOfChars).isEqualTo(31);
		
		System.out.println(Arrays.stream(arrayOfStrings)
				  .collect(Collectors.summarizingInt(String::length)).toString());
	}
	
}
