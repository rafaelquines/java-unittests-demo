package com.rafaelquines.unittestsdemo.application.controller;

import com.rafaelquines.unittestsdemo.application.facade.CalculatorFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTests {

    @Mock
    CalculatorFacade calculatorFacade;

    @InjectMocks
    CalculatorController calculatorController;

    @Test
    public void sumTest() {
        int a = 9;
        int b = 10;
        int expectedResult = 19;
        Mockito.when(this.calculatorFacade.sum(a, b)).thenReturn(expectedResult);

        ResponseEntity<Integer> response = calculatorController.sum(a, b);

        Assertions.assertEquals(response.getStatusCodeValue(), 200);
        Assertions.assertEquals(response.getBody(), expectedResult);
        Mockito.verify(calculatorFacade).sum(a, b);
    }

    @Test
    public void subtractTest() {
        int a = 20;
        int b = 3;
        int expectedResult = 17;
        Mockito.when(this.calculatorFacade.subtract(a, b)).thenReturn(expectedResult);

        ResponseEntity<Integer> response = calculatorController.subtract(a, b);

        Assertions.assertEquals(response.getStatusCodeValue(), 200);
        Assertions.assertEquals(response.getBody(), expectedResult);
        Mockito.verify(calculatorFacade).subtract(a, b);
    }

    @Test
    public void multiplyTest() {
        int a = 3;
        int b = 5;
        int expectedResult = 15;
        Mockito.when(this.calculatorFacade.multiply(a, b)).thenReturn(expectedResult);

        ResponseEntity<Integer> response = calculatorController.multiply(a, b);

        Assertions.assertEquals(response.getStatusCodeValue(), 200);
        Assertions.assertEquals(response.getBody(), expectedResult);
        Mockito.verify(calculatorFacade).multiply(a, b);
    }

    @Test
    public void divideTest() {
        int a = 12;
        int b = 3;
        int expectedResult = 4;
        Mockito.when(this.calculatorFacade.divide(a, b)).thenReturn(expectedResult);

        ResponseEntity<Integer> response = calculatorController.divide(a, b);

        Assertions.assertEquals(response.getStatusCodeValue(), 200);
        Assertions.assertEquals(response.getBody(), expectedResult);
        Mockito.verify(calculatorFacade).divide(a, b);
    }

    @Test
    public void sumAndMultiplyTest() {
        int a = 2;
        int b = 4;
        int c = 6;
        int expectedResult = 36;
        Mockito.when(this.calculatorFacade.sumAndMultiply(a, b, c)).thenReturn(expectedResult);

        ResponseEntity<Integer> response = calculatorController.sumAndMultiply(a, b, c);

        Assertions.assertEquals(response.getStatusCodeValue(), 200);
        Assertions.assertEquals(response.getBody(), expectedResult);
        Mockito.verify(calculatorFacade).sumAndMultiply(a, b, c);
    }
}
