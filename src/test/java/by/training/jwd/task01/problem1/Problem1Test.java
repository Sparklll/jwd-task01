package by.training.jwd.task01.problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
    Problem1 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem1();
    }

    @Test
    void obtainLastDigitOfSquareNumber_NumberIsPositive() {
        int expected = 1;
        int actual = problemInstance.obtainLastDigitOfSquareNumber(199);
        assertEquals(expected, actual);
    }

    @Test
    void obtainLastDigitOfSquareNumber_NumberIsZero() {
        int expected = 0;
        int actual = problemInstance.obtainLastDigitOfSquareNumber(0);
        assertEquals(expected, actual);
    }

    @Test
    void obtainLastDigitOfSquareNumber_NumberIsNegative() {
        int expected = 9;
        int actual = problemInstance.obtainLastDigitOfSquareNumber(-777);
        assertEquals(expected, actual);
    }
}
