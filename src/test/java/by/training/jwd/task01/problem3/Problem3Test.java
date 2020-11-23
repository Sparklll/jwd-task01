package by.training.jwd.task01.problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {
    public static final double THRESHOLD = 1E-6;
    Problem3 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem3();
    }

    @Test
    void areaOfSquareInscribedInCircleInscribedInSquare_InvalidSquareValue_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class,
                () -> problemInstance.areaOfSquareInscribedInCircleInscribedInSquare(-5));
    }

    @Test
    void areaOfSquareInscribedInCircleInscribedInSquare_CircumscribedSquareArea_InscribedSquareTwiceSmaller() {
        double expected = 250;
        double actual = problemInstance.areaOfSquareInscribedInCircleInscribedInSquare(500);
        assertEquals(expected, actual, THRESHOLD);
    }
}