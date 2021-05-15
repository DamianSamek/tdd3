package tdd3;

public class RectangularTriangleChecker {

	public static boolean canBuildRectangularTriangle(int i, int j, int k) {
		return Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2);
	}

}
