package calculatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator classaTester = new Calculator();
		assertEquals(5, classaTester.add(2, 3));
	}

	@Test
	public void testSub() {
		Calculator classaTester = new Calculator();
		assertEquals(-1, classaTester.sub(2, 3));
	}
	
	@Test
	public void testTime() {
		Calculator classaTester = new Calculator();
		assertEquals(10,classaTester.time(2, 5));
		assertEquals(0,classaTester.time(2, 0));
	}
	
	@Test
	public void testEven() {
		Calculator classaTester = new Calculator();
		assertTrue(classaTester.isEven(4));
		assertFalse(classaTester.isEven(5));
	}
	
	@Test
	public void testOdd() {
		Calculator classaTester = new Calculator();
		assertTrue(classaTester.isEven(5));
		assertFalse(classaTester.isEven(6));
	}
}
