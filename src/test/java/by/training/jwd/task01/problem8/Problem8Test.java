package by.training.jwd.task01.problem8;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {
    public static final double THRESHOLD = 1E-6;
    Problem8 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem8();
    }

    @Test
    void functionValue_InvalidNaNArgument_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> problemInstance.functionValue(Double.NaN));
    }

    @Test
    void functionValue_ArgumentOutOfFunctionDomain_IllegalArgumentExceptionThrown() {
        double forbiddenFunctionArgument = Math.pow(6, 1.0 / 3);
        assertThrows(IllegalArgumentException.class, () -> problemInstance.functionValue(forbiddenFunctionArgument));
    }

    @Test
    void functionValue_ArgumentIsGreaterThan3() {
        double expected = -61;
        double actual = problemInstance.functionValue(10);
        assertEquals(expected, actual, THRESHOLD);
    }

    @Test
    void functionValue_ArgumentIsEqual3() {
        double expected = 9;
        double actual = problemInstance.functionValue(3);
        assertEquals(expected, actual, THRESHOLD);
    }

    @Test
    void functionValue_ArgumentIsLessThan3() {
        double expected = -0.2;
        double actual = problemInstance.functionValue(1);
        assertEquals(expected, actual, THRESHOLD);
    }
}