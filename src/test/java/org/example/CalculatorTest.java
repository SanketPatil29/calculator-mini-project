package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void factorial() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
        assertEquals(0, calculator.factorial(-5));
    }

    @Test
    void squareRoot() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.squareRoot(25));
    }

    @Test
    void naturalLogarithm() {
        Calculator calculator = new Calculator();
        assertEquals(2.302585092994046, calculator.naturalLogarithm(10));
        assertEquals(Double.NaN, calculator.naturalLogarithm(-10));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void power() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.power(2, 3));
        assertEquals(0.125, calculator.power(2, -3));
        assertEquals(0, calculator.power(0, 4));
    }
}