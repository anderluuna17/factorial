package com.example.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void calculatesFactorial() {
        assertEquals(1, Factorial.calculate(0));
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void rejectsNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1));
    }
}
