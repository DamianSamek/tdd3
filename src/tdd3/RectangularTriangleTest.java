package tdd3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class RectangularTriangleTest {

	@Test
	public void testWhenAllParametersAreOk() {
		assertTrue(RectangularTriangleChecker.canBuildRectangularTriangle(3,4,5));
	}
	
	@Test
	public void testWhenAllParametersAreNotOk() {
		assertFalse(RectangularTriangleChecker.canBuildRectangularTriangle(3,4,9));
	}
	
	@Test
	public void testWhenAtLeastOneParameterIsZeroOrLessThanZero() {
		assertThrows(ArithmeticException.class, () -> RectangularTriangleChecker.canBuildRectangularTriangle(0, 2, 5));
	}
}
