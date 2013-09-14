package com.rhcloud.pbtest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {
     private Calculator calculator = new Calculator();

    @Test
    public void shouldAddNumbers(){
       int number1 = 10;
       int number2 = 5;
        calculator.add(number1, number2);
       assertTrue(calculator.getResult() == 15);
    }

}
