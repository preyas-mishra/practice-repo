import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	private int expectedResult;
	private int actualResult;
	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	void testAddition() {
		actualResult = calculator.addition(10, 20);
		expectedResult = 30;
		assertEquals(expectedResult,actualResult);
	}

	@Test
	void testSubtraction() {
		actualResult = calculator.subtraction(10, 20);
		expectedResult = -10;
		assertEquals(expectedResult,actualResult);
	}

	@Test
	void testMultiplication() {
		actualResult = calculator.multiplication(10, 20);
		expectedResult = 200;
		assertEquals(expectedResult,actualResult);
	}

	@Test
	void testDivision() {
		actualResult = calculator.division(20, 10);
		expectedResult = 2;
		assertEquals(expectedResult,actualResult);
		
	}

	@Test
	void testSquare() {
		actualResult = calculator.square(10);
		expectedResult = 100;
		assertEquals(expectedResult,actualResult);
	}

	@Test
	void testCube() {
		actualResult = calculator.cube(10);
		expectedResult = 1000;
		assertEquals(expectedResult,actualResult);
	}
	
}
