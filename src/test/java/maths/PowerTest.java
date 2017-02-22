package maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PowerTest {

	@Test
	public void valid() {
		assertThat(Power.powRecursive(2, 4)).isEqualTo(Math.pow(2, 4));
		assertThat(Power.powRecursive(5, 12)).isEqualTo(Math.pow(5, 12));
		assertThat(Power.powRecursive(2, 5)).isEqualTo(Math.pow(2, 5));
		assertThat(Power.powRecursive(2, 11)).isEqualTo(Math.pow(2, 11));
		assertThat(Power.powRecursive(2, -5)).isEqualTo(2.5);
		assertThat(Power.powRecursive(2, -11)).isEqualTo(5.5);
	}
	
}
