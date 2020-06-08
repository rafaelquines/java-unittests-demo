package com.rafaelquines.unittestsdemo.application.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CalculatorFacadeTodayTests {

    @Autowired
    private CalculatorFacade calculatorFacade;

    @Test
    public void sumTest() {
        // Arrange
        int a = 7;
        int b = 8;
        // Act
        Integer result = calculatorFacade.sum(a, b);
        // Assert
        Assertions.assertNotNull(result);
    }

    @Test
    public void subtractTest() {
        int a = 10;
        int b = 4;
        Integer result = calculatorFacade.subtract(a, b);
        Assertions.assertNotNull(result);
    }

    @Test
    public void multiplyTest() {
        int a = 4;
        int b = 10;
        Integer result = calculatorFacade.multiply(a, b);
        Assertions.assertNotNull(result);
    }

    @Test
    public void divideTest() {
        int a = 12;
        int b = 4;
        Integer result = calculatorFacade.divide(a, b);
        Assertions.assertNotNull(result);
    }

    @Test
    public void sumAndMultiplyTest() {
        int a = 2;
        int b = 4;
        int c = 6;

        Integer result = calculatorFacade.sumAndMultiply(a, b, c);

        Assertions.assertNotNull(result);
    }
}
