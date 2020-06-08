package com.rafaelquines.unittestsdemo.application.controller;

import com.rafaelquines.unittestsdemo.application.facade.CalculatorFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorFacade calculator;

    @GetMapping("/sum")
    public ResponseEntity<Integer> sum(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculator.sum(a, b));
    }

    @GetMapping("/subtract")
    public ResponseEntity<Integer> subtract(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculator.subtract(a, b));
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculator.multiply(a, b));
    }

    @GetMapping("/divide")
    public ResponseEntity<Integer> divide(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculator.divide(a, b));
    }

    @GetMapping("/sum-and-multiply")
    public ResponseEntity<Integer> sumAndMultiply(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        return ResponseEntity.ok(this.calculator.sumAndMultiply(a, b, c));
    }
}
