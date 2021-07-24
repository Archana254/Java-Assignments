package basic;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prg21Test {

	@Test
	void test() {
		int year=2000;

		int actualOutput = Prg21.leapYear(year);

		int expectedOutput = 1;

		assertEquals(expectedOutput, actualOutput);
	}

}
