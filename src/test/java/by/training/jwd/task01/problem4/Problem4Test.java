package by.training.jwd.task01.problem4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {
    Problem4 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem4();
    }

    @Test
    void hasTwoEvenNumbers_NoEvenNumber_False() {
        boolean actual = problemInstance.hasTwoEvenNumbers(1, 3, 5, 7);
        assertFalse(actual);
    }

    @Test
    void hasTwoEvenNumbers_OneEvenNumber_False() {
        boolean actual = problemInstance.hasTwoEvenNumbers(-1, 3, -5, 8);
        assertFalse(actual);
    }

    @Test
    void hasTwoEvenNumbers_TwoEvenNumbers_True() {
        boolean actual = problemInstance.hasTwoEvenNumbers(1, 3, -6, -8);
        assertTrue(actual);
    }
}