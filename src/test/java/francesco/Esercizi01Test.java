package francesco;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Esercizi01Test {

	@Test
	void testIsPrime() {
		assertTrue(Esercizi01.isPrime(7));
	}

	@Test
	void testEvenIsPrime() {
		assertTrue(!Esercizi01.isPrime(12));
	}

	@Test
	void testIsArmstrong() {
		assertTrue(Esercizi01.isArmstrong(3));
	}

	@Test
	void testStringReverse() {
		assertEquals(Esercizi01.reverse("razzo"), "ozzar");
	}
	
	@Test
	void testStringReverseComplex() {
		assertEquals(Esercizi01.reverse("BanaNa"), "aNanaB");
	}
}