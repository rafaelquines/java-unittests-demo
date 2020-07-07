package com.rafaelquines.unittestsdemo.application.facade;

import com.rafaelquines.unittestsdemo.application.service.CalculatorService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorFacade2Tests {

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorFacade calculatorFacade;

    @Test
    public void sumTest1() {
        // Arrange
        int a = 7;
        int b = 8;
        int expectedResult = 15;
        Mockito.when(calculatorService.sum(a, b)).thenReturn(expectedResult);

        // Act
        Integer result = calculatorFacade.sum(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calculatorService, Mockito.times(1)).sum(a, b);
    }

    @Test
    public void sumTest2() {
        // Arrange
        int a = -8;
        int b = 3;
        int expectedResult = -5;
        Mockito.when(calculatorService.sum(a, b)).thenReturn(expectedResult);

        // Act
        Integer result = calculatorFacade.sum(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calculatorService, Mockito.times(1)).sum(a, b);
    }

    @Test
    public void sumTest3() {
        // Arrange
        int a = -9;
        int b = -5;
        int expectedResult = -14;
        Mockito.when(calculatorService.sum(a, b)).thenReturn(expectedResult);

        // Act
        Integer result = calculatorFacade.sum(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calculatorService, Mockito.times(1)).sum(a, b);
    }

    @Test
    public void subtractTest() {
        int a = 10;
        int b = 4;
        int expectedResult = 6;

        Mockito.when(calculatorService.subtract(a, b)).thenReturn(expectedResult);

        Integer result = calculatorFacade.subtract(a, b);

        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calculatorService, Mockito.times(1)).subtract(a, b);
    }

    @Test
    public void multiplyTest() {
        int a = 4;
        int b = 10;
        int expectedResult = 40;

        Mockito.when(calculatorService.multiply(a, b)).thenReturn(expectedResult);

        Integer result = calculatorFacade.multiply(a, b);

        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calculatorService, Mockito.times(1)).multiply(a, b);
    }

    @Test
    public void divideTest() {
        int a = 12;
        int b = 4;
        int expectedResult = 3;

        Mockito.when(calculatorService.divide(a, b)).thenReturn(expectedResult);

        Integer result = calculatorFacade.divide(a, b);

        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calculatorService, Mockito.times(1)).divide(a, b);
    }

    @Test
    public void sumAndMultiplyTest() {
        int a = 2;
        int b = 4;
        int sum = 6;
        int c = 6;
        int expectedResult = 36;

        CalculatorFacade calcFacadeMock = Mockito.spy(calculatorFacade);

        Mockito.when(calcFacadeMock.sum(a, b)).thenReturn(sum);
        Mockito.when(calcFacadeMock.multiply(sum, c)).thenReturn(expectedResult);

        Integer result = calculatorFacade.sumAndMultiply(a, b, c);

        Assertions.assertEquals(result, expectedResult);
        Mockito.verify(calcFacadeMock, Mockito.times(1)).sum(a, b);
        Mockito.verify(calcFacadeMock, Mockito.times(1)).multiply(sum, c);
    }


}
