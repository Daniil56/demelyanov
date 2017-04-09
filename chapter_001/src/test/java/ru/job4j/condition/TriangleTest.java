package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**...
 * Test.
 * @author Daniil Emelyanov
 * @version %Id%
 * @since 09/04/17.
 */
 public class TriangleTest {
	/**
	* Test for method area.
	*/
	@Test
	public void  whenCalcAreaTriang() {
		Point aPoint = new Point(2, 1);
		Point bPoint = new Point(4, 4);
		Point cPoint = new Point(2, 4);
		Triangle triangleabc = new Triangle(aPoint, bPoint, cPoint);
		double result = triangleabc.area();
		double expected = 3D;
		assertThat(result, closeTo(expected, 0.01));

	}
 }