package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add_sumsTwoNumbers() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void subtract_subtractsSecondFromFirst() {
        assertEquals(1, calculator.subtract(5, 4));
    }
}
