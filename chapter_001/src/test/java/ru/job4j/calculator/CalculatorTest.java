package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2d;
        assertThat(result, is(expected));
    }
	
	@Test
	public void whenSubOneMinusOneThenTwo(){
		Calculator cal = new Calculator();
		calc.substruct (1, 1);
		double result = calc.getResult();
        double expected = 0d;
        assertThat(result, is(expected));
	}
	
	@Test
	Public void whenDivOneDivThenTwo(){
		Calculator calc = new Calculator();
        calc.div(1, 1);
        double result = calc.getResult();
        double expected = 1d;
        assertThat(result, is(expected));
	}
	
	@Test
	public void whenMulOneMultThenTwo(){
		Calculator calc = new Calculator();
        calc.multiple(2, 3);
        double result = calc.getResult();
        double expected = 6d;
        assertThat(result, is(expected));
	}
		
}
