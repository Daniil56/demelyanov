package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Daniil Emelyanov
 * @version %Id%
 * @since 0.1
 */
public class CalculatorTest {
	/**
	* Test add.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2d;
        assertThat(result, is(expected));
    }
	/**
	* Test sub.
	*/
	@Test
	public void whenSubOneMinusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.sub(3, 1);
		double result = calc.getResult();
        double expected = 2d;
        assertThat(result, is(expected));
	}
	/**
	* Test div.
	*/
	@Test
	public void whenDivOneDivThenTwo() {
		Calculator calc = new Calculator();
        calc.div(1, 1);
        double result = calc.getResult();
        double expected = 1d;
        assertThat(result, is(expected));
	}
	/**
	/* Test multi.
	*/
	@Test
	public void whenMulOneMultThenTwo() {
		Calculator calc = new Calculator();
        calc.multiple(2, 3);
        double result = calc.getResult();
        double expected = 6d;
        assertThat(result, is(expected));
	}
}
