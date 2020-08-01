package federico;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S04Test {
    @Test
    void sumPositive() {
        long actual = S04.sum(1, 3);

        assertThat(actual, is(6L));
    }

    @Test
    void sumNegPos() {
        long actual = S04.sum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void sumSingle() {
        long actual = S04.sum(1003, 1003);

        assertThat(actual, is(1003L));
    }

    @Test
    void sumEmpty() {
        long actual = S04.sum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumPositive() {
        long actual = S04.evenSum(1, 3);

        assertThat(actual, is(2L));
    }

    @Test
    void evenSumNegPos() {
        long actual = S04.evenSum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumSingle() {
        long actual = S04.evenSum(1002, 1002);

        assertThat(actual, is(1002L));
    }

    @Test
    void evenSumEmpty() {
        long actual = S04.evenSum(1003, 1002);

        assertThat(actual, is(0L));
    }
    
    @Test
    void sqrtPositive() {
        double actual = S04.sqrt(1003);
        double expected = Math.sqrt(1003);
        
        assertThat(actual, closeTo(expected, 0.001));
    }
    
    @Test
    void sqrtZero() {
        double actual = S04.sqrt(0);
        double expected = 0;
        
        assertThat(actual, is(expected));
    }
    
    @Test
    void sqrtNegative() {
        double actual = S04.sqrt(-3);
        
        assertThat(actual, is(Double.NEGATIVE_INFINITY));
    }
    
    @Test
    void sqrtEpsilonPositive() {
        double actual = S04.sqrt(1003, 0.005);
        double expected = Math.sqrt(1003);
        
        assertThat(actual, closeTo(expected, 0.005));
    }
    
    @Test
    void sqrtEpsilonZero() {
        double actual = S04.sqrt(0, 0.0001);
        double expected = 0;
        
        assertThat(actual, is(expected));
    }
    
    @Test
    void sqrtEpsilonNegative() {
        double actual = S04.sqrt(-3, 0.005);
        
        assertThat(actual, is(Double.NEGATIVE_INFINITY));
    }

    @Test
    void factorialFour() {
        long actual = S04.factorial(4);

        assertThat(actual, is(24L));
    }
    
    @Test
    void factorialOne() {
        long actual = S04.factorial(1);

        assertThat(actual, is(1L));
    }

    @Test
    void factorialNegative() {
        long actual = S04.factorial(-4);

        assertThat(actual, is(0L));
    }

    @Test
    void fibonacciOne() {
    	long actual = S04.fibonacci(1);

        assertThat(actual, is(1L));
    }
    
    @Test
    void fibonacciZero() {
    	long actual = S04.fibonacci(0);

        assertThat(actual, is(0L));
    }
    
    @Test
    void fibonacciTen() {
    	long actual = S04.fibonacci(10);

        assertThat(actual, is(55L));
    }
    
    @Test
    void fibonacciNegative() {
    	long actual = S04.fibonacci(-3);

        assertThat(actual, is(0L));
    }

    @Test
    void multiplicationTableZero() {
        int[][] actual = S04.multiplicationTable(0);

        int[][] expected = {};
        assertThat(actual, is(expected));
    }
    
    @Test
    void multiplicationTableNegative() {
        int[][] actual = S04.multiplicationTable(-3);

        int[][] expected = {};
        assertThat(actual, is(expected));
    }

    @Test
    void multiplicationTableThree() {
        int[][] actual = S04.multiplicationTable(3);

        int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };
        assertThat(actual, is(expected));
    }
}
