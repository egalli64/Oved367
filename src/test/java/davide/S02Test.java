package davide;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S02Test {

	@Test
	void speedPlain() {
		double actual = S02.speed(100, 9.58);

		assertThat(actual, closeTo(10.438, 0.001));
	}

	@Test
	void speedInfinity() {
		double actual = S02.speed(100, 0);

		assertThat(actual, is(Double.POSITIVE_INFINITY));
	}

	@Test
	void distanceSquareTwo() {
		double actual = S02.distance(1, 10, 2, 9);

		assertThat(actual, closeTo(Math.sqrt(2), 0.000_001));
	}

	@Test
	void distanceZero() {
		double actual = S02.distance(27, 42, 27, 42);

		assertThat(actual, is(0.0));
	}

	@Test
	void engineCapacityPlain() {
		double actual = S02.engineCapacity(74, 75, 4);

		assertThat(actual, closeTo(1290.252, 0.001));
	}

	@Test
	void digitSumPositive() {
		try {
			int actual = S02.digitSum(123);
			assertThat(actual, is(6));
		} catch (ExerciseException e) {
			fail(e);
		}
	}

	@Test
	void digitSumZero() {
		try {
			int actual = S02.digitSum(0);
			assertThat(actual, is(0));
		} catch (ExerciseException e) {
			fail(e);
		}


	}

	@Test
	public void digitSumNegative() {
		ExerciseException exc = assertThrows(ExerciseException.class, () -> S02.digitSum(-123));
		assertThat(exc.getMessage(), is("Not expected negative value"));
	}

//
//    @Test
//    void digitSumNegative() {
//        int actual = S02.digitSum(-123);
//
//        assertThat(actual, is(6));
//    }

	@Test
	void scoreTen() {
		int actual = S02.score(0.1, -0.1);

		assertThat(actual, is(10));
	}

	@Test
	void scoreOne() {
		int actual = S02.score(3.55, 3.55);

		assertThat(actual, is(1));
	}
}
