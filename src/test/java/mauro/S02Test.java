package mauro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
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

}
