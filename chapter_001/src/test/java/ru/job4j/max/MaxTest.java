package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**...
 * Test.
 * @author Daniil Emelyanov
 * @version %Id%
 * @since 0.1
 */
public class MaxTest {
	/**...
	* Test max with two args.
	*/
	@Test
	public void whenMaxWhithTwoArgs() {
		Max maxvalue = new Max();
		assertThat(maxvalue.max(3, 2, 4), is(4));
	 }
}