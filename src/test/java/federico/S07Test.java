package federico;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class S07Test {

	@Test
    void isPerfectNegative() {
		boolean actual = S07.isPerfect(-2);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isPerfectNo() {
		boolean actual = S07.isPerfect(1368);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isPerfectYes() {
		boolean actual = S07.isPerfect(496);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isAbundantYes() {
		boolean actual = S07.isAbundant(12);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isAbundantNo() {
		boolean actual = S07.isAbundant(8);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isAbundantNegative() {
		boolean actual = S07.isAbundant(-2);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isDeficientYes() {
		boolean actual = S07.isDeficient(8);
		
		assertThat(actual, is(true));
    }
    
    @Test
    void isDeficientNo() {
		boolean actual = S07.isDeficient(12);
		
		assertThat(actual, is(false));
    }
    
    @Test
    void isDeficientNegative() {
		boolean actual = S07.isDeficient(-2);
		
		assertThat(actual, is(false));
    }

}
