package maths;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class FactorialTest {

	@Test
	public void iterative() {
		assertThat(new Factorial().calculateIterative(5)).isEqualTo(120);
		assertThat(new Factorial().calculateIterative(6)).isEqualTo(720);
		assertThat(new Factorial().calculateIterative(7)).isEqualTo(5040);
	}
	
	@Test
	public void recursive() {
		assertThat(new Factorial().calculateRecursive(5)).isEqualTo(120);
		assertThat(new Factorial().calculateRecursive(6)).isEqualTo(720);
		assertThat(new Factorial().calculateRecursive(7)).isEqualTo(5040);
	}
	
}
