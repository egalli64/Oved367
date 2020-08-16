package emilia;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtheExerciseTest {
	@Test
	void yesIsArmstrong() {
		boolean actual = OtherExercise.isArmstrong(153);
		assertThat(actual,is (true));
	}
	@Test
	void noIsntArmstrong() {
		boolean actual = OtherExercise.isArmstrong(18);
		assertThat(actual,is (false));
	}
	
	@Test
	void yesIsPangram() {
		String s = "The quick brown fox jumps over the lazy dog";
		boolean actual = OtherExercise.isPangram(s);
		assertThat(actual,is (true));
	}
	
	@Test
	void noIsntPangram() {
		String s = "Hello world";
		boolean actual = OtherExercise.isPangram(s);
		assertThat(actual,is (false));
	}
	
	@Test
	void hammingDifferentLength() {
		char[] s1 = {'1','2','3','9'};
		char[] s2 = {'1','2','5'};;
		int actual = OtherExercise.hammingDistance(s1,s2);
		assertThat(actual,is (-1));
	}
	
	@Test
	void hammingNumbers() {
		char[] s1 = {'1','2','3','9','6'};
		char[] s2 = {'1','2','5','9','8'};;
		int actual = OtherExercise.hammingDistance(s1,s2);
		assertThat(actual,is (2));
	}
	@Test
	void hammingLetters() {
		char[] s1 = {'a','h','j','j','l'};
		char[] s2 = {'z','k','l','j','s'};;
		int actual = OtherExercise.hammingDistance(s1,s2);
		assertThat(actual,is (4));
	}
}
