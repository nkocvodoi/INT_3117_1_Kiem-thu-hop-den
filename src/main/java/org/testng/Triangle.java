package org.testng;

/**
 * @author Nguyen Thi Cam Van
 */

public class Triangle {

	public static String NOT_RIGHT_ANGLED_TRIANGLE = "Not right angled triangle";
	public static String INVALID_TRIANGLE = "Invalid Triangle";
	public static String RIGHT_ANGLED_TRIANGLE = "Right angled triangle";

	public String checkTriangleType(double a, double b, double c) {
		boolean baseCondition1 = (a + b > c
				&& a + c > b && b + c > a);
		boolean baseCondition2 = (a > 0 && b > 0 && c > 0);

		while (baseCondition1 && baseCondition2) {

			boolean condition1 = Math.sqrt(a * a + b * b) == c;
			boolean condition2 = Math.sqrt(a * a + c * c) == b;
			boolean condition3 = Math.sqrt(c * c + b * b) == a;

			if (condition1 || condition2 || condition3) {
				return RIGHT_ANGLED_TRIANGLE;
			}else {
				return NOT_RIGHT_ANGLED_TRIANGLE;
			}
		}
		return INVALID_TRIANGLE;

	}
}
