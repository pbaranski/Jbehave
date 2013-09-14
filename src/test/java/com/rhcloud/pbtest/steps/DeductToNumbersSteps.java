package com.rhcloud.pbtest.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;


public class DeductToNumbersSteps extends AddTwoNumbersSteps {


    @When("I deduct <number1> and <number2>")
    public void whenIDeductNumber1AndNumber2(@Named("number1")int number1, @Named("number2")int number2) {
        calculator.deduct(number1, number2);
    }

}
