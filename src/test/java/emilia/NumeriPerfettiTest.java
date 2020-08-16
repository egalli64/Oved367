package emilia;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

class NumeriPerfettiTest {

	@Test
	void isNegative() {
		boolean actual = NumeriPerfetti.isPrime(-4);
		assertThat(actual,is (false));
	}
	
	@Test
	void yesIsPrime() {
		boolean actual = NumeriPerfetti.isPrime(17);
		assertThat(actual,is (true));
	}
	@Test
	void noIsntPrime() {
		boolean actual = NumeriPerfetti.isPrime(18);
		assertThat(actual,is (false));
	}
	
	@Test
	void IsNegativeAbudant() {
		boolean actual = NumeriPerfetti.isAbudant(-12);
		assertThat(actual,is (false));
	}
	
	@Test
	void yesIsAbudant() {
		boolean actual = NumeriPerfetti.isAbudant(12);
		assertThat(actual,is (true));
	}
	@Test
	void noIsntAbudant() {
		boolean actual = NumeriPerfetti.isAbudant(10);
		assertThat(actual,is (false));
	}
	
	@Test
	void IsNegativeDeficient() {
		boolean actual = NumeriPerfetti.isDeficient(-12);
		assertThat(actual,is (false));
	}
	
	@Test
	void yesIsDeficient() {
		boolean actual = NumeriPerfetti.isDeficient(8);
		assertThat(actual,is (true));
	}
	@Test
	void noIsntDeficient() {
		boolean actual = NumeriPerfetti.isDeficient(12);
		assertThat(actual,is (false));
	}
}

