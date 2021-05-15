package tdd3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RectangularTriangleTest {

	@Test
	public void testWhenAllParametersAreOk() {
		assertTrue(RectangularTriangleChecker.canBuildRectangularTriangle(3,4,5));
	}
}
