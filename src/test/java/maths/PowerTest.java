package maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PowerTest {

	@Test
	public void valid() {
		assertThat(Power.powIterative(2, 4)).isEqualTo(Math.pow(2, 4));
		assertThat(Power.powRecursive(2, 4)).isEqualTo(Math.pow(2, 4));
		assertThat(Power.powIterative(5, 12)).isEqualTo(Math.pow(5, 12));
		assertThat(Power.powRecursive(5, 12)).isEqualTo(Math.pow(5, 12));
	}
	
}
