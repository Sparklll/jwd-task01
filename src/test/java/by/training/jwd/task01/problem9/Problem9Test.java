package by.training.jwd.task01.problem9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem9Test {
    public static final double THRESHOLD = 1E-2;
    Problem9 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem9();
    }


    @Test
    void getCircumference_InvalidRadiusValue_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> problemInstance.getCircumference(-10));
    }

    @Test
    void getCircleArea_InvalidRadiusValue_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> problemInstance.getCircleArea(-10));
    }

    @Test
    void getCircumference_CircleRadiusIs10() {
        double expected = 62.83;
        double actual = problemInstance.getCircumference(10);
        assertEquals(expected, actual, THRESHOLD);
    }

    @Test
    void getCircumference_CircleRadiusIs0() {
        double expected = 0;
        double actual = problemInstance.getCircumference(0);
        assertEquals(expected, actual, THRESHOLD);
    }

    @Test
    void getCircleArea_CircleRadiusIs10() {
        double expected = 314.15;
        double actual = problemInstance.getCircleArea(10);
        assertEquals(expected, actual, THRESHOLD);
    }

    @Test
    void getCircleArea_CircleRadiusIs0() {
        double expected = 0;
        double actual = problemInstance.getCircleArea(0);
        assertEquals(expected, actual, THRESHOLD);
    }
}