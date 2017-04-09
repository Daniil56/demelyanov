package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**...
 * Test.
 * @author Daniil Emelyanov
 * @version %Id%
 * @since 0.1
 */
 public class PointTest {
	/**
	* Test for method is.
	* (a=3, b=1) y(x)=3*x+1
	* The point coordinae x = 2, y = 7.
	* The exepted result is
	*/
	@Test
	public void whenPointIsInsideThenTrue() {
		Point point = new Point(2, 7);
		point.is(3, 1);
		boolean result = point.is(3, 1);
		boolean expected = true;
		assertThat(result, is(true));
	}
 }