package francesco;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SandboxTest {

	@Test
	void testArrayList() {
		int[] array = { 1, 1, 1, 1 };
		var res = new ArrayList<Integer>();
		var methodRes = new ArrayList<Integer>();
		try {
			methodRes = Sandbox.singles(array);
		} catch (Exception e) {
			fail("Exception caught!");
		} finally {
			assertTrue(methodRes.equals(res));
		}

	}

	@Test
	void testNullArray() {
		int[] array = null;
		try {
			Sandbox.singles(array);
			fail("No exception caught!");
		} catch (Exception e) {
			assertTrue(e.getMessage().equals("Null array in input!!"));
		}

	}

	@Test
	void testGetSinglesFast() {
		int[] data = { 1, 2, 3, 6, 3, 2, 1, 4 };
		var res = new ArrayList<Integer>(Arrays.asList(4, 6));
		var methodRes = new ArrayList<Integer>();
		try {
			methodRes = Sandbox.singles(data);
		} catch (Exception e) {
			fail("Exception caught!");
		} finally {
			assertTrue(methodRes.equals(res));
		}

	}

}
