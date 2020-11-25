package by.training.jwd.task01.problem10;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {
    public static final double THRESHOLD = 1E-3;
    Problem10 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem10();
    }


    @Test
    void calculateFunction_InvalidArgumentsRange_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            problemInstance.calculateFunction(10, 5, 0.1);
        });
    }

    @Test
    void calculateFunction_InvalidRangeStep_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            problemInstance.calculateFunction(1, 10, -10);
        });
    }

    @Test
    void calculateFunction_CorrectRangeAndStep() {
        Map<Double, Double> expectedFunctionArgumentsAndValues = new LinkedHashMap<>() {{
            put(-2.0, 2.185);
            put(-1.5, -14.101);
            put(-1.0, -1.557);
            put(-0.5, -0.546);
            put(0.0, 0.0);
            put(0.5, 0.546);
            put(1.0, 1.557);
            put(1.5, 14.101);
            put(2.0, -2.185);
        }};
        int expectedSize = 9;

        double lowerX = -2;
        double topX = 2;
        double step = 0.5;
        Map<Double, Double> actualFunctionArgumentAndValues = problemInstance.calculateFunction(lowerX, topX, step);
        int actualSize = actualFunctionArgumentAndValues.size();

        assertAll(
                () -> assertEquals(expectedSize, actualSize),
                () -> actualFunctionArgumentAndValues.forEach((argumentValue, functionValue) -> {
                    Double expectedValue = expectedFunctionArgumentsAndValues.get(argumentValue);
                    assertEquals(expectedValue, functionValue, THRESHOLD);
                })
        );
    }
}