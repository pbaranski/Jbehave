package com.rhcloud.pbtest.calculator;

import com.rhcloud.pbtest.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: A
 * Date: 02.11.13
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorDivideTest {
    private Calculator calc = new Calculator();

    @Test
    public  void shouldDivideNumberByAnotherNumber(){
        calc.divide(4,2);
        assertEquals("Divide unsuccessfull", calc.getResult(), 2);
    }

}
