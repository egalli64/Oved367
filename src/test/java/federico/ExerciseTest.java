package federico;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ExerciseTest {


	@Test
	void EvensPlain() {
		int[] values = {1, 2, 3, 5, 6, 7};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 6));
		ArrayList<Integer> actual = Exercise.evens(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void EvensNull() {
		int[] values = null;
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.evens(values);

		assertThat(actual, is(expected));
	}
	
	
	@Test
	void EvensEmpty() {
		int[] values = {1, 3, 5, 7, 9};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.evens(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesPlain() {
		int[] values = {1, 7, 1, 2, 5, 6, 6, 2};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 7));
		ArrayList<Integer> actual = Exercise.singles(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesNull() {
		int[] values = null;
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.singles(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesEmpty() {
		int[] values = {};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.singles(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesFalse() {
		int[] values = {1, 1, 3, 3, -5, -5, -9, -9};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.singles(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesMapPlain() {
		int[] values = {1, 7, 1, 2, 5, 6, 6, 2};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 7));
		ArrayList<Integer> actual = Exercise.singlesMap(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesMapNull() {
		int[] values = null;
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.singlesMap(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesMapEmpty() {
		int[] values = {};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.singlesMap(values);

		assertThat(actual, is(expected));
	}
	
	@Test
	void SinglesMapFalse() {
		int[] values = {1, 1, 3, 3, -5, -5, -9, -9};
		
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> actual = Exercise.singlesMap(values);

		assertThat(actual, is(expected));
	}
	
}
