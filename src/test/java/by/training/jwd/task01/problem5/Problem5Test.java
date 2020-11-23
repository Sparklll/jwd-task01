package by.training.jwd.task01.problem5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {
    Problem5 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem5();
    }

    @Test
    void isNumberPerfect_NotNaturalNumber_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> problemInstance.isNumberPerfect(-1));
    }

    @Test
    void isNumberPerfect_NumberIsNaturalAndPerfect_True() {
        boolean actual = problemInstance.isNumberPerfect(8128);
        assertTrue(actual);
    }

    @Test
    void isNumberPerfect_NumberIsNaturalAndNotPerfect_False() {
        boolean actual = problemInstance.isNumberPerfect(100);
        assertFalse(actual);
    }
}