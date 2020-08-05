package mauro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S02Test {

	@Test
	void digitSumPositive() {

		try {
			int actual = S02.digitSum(123);
			assertThat(actual, is(6));
		} catch (ExciseExpection e) {
			fail(e);
		}
	}

	@Test
	void digitSumZero() {
		try {
			int actual = S02.digitSum(0);
			assertThat(actual, is(0));
		} catch (ExciseExpection e) {
			fail(e);
		}
	}

	@Test
	void digitSumNegative() {
		try {
			S02.digitSum(-123);
			fail("An ExciseExpection was expected");
		} catch (ExciseExpection iae) {
			String message = iae.getMessage();
			assertThat(message, is("Negative values aren't allowed"));
			return;

		}
	}
}