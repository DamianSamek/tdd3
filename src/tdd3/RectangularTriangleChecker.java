package tdd3;

public class RectangularTriangleChecker {

	public static boolean canBuildRectangularTriangle(int i, int j, int k) {
		if (i <= 0 || j <= 0 || k <= 0) {
			throw new ArithmeticException();
		}
		return Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2);
	}

}
